import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    String albumName, artist;
    int available, total, disewakan;

    ObservableList<Album> dataAlbum = FXCollections.observableArrayList();

    @FXML
    private TableColumn<Album, String> albumNameColumnMenu;

    @FXML
    private TableColumn<Album, String> artistColumnMenu;

    @FXML
    private TableColumn<Album, Integer> availableColumnMenu;

    @FXML
    private TableView<Album> tableAlbum;

    @FXML
    private Button hapusButtonMenu;

    @FXML
    private TextField judulAlbumMenu;

    @FXML
    private TextField jumlahDisewaMenu;

    @FXML
    private TextField jumlahTotalMenu;

    @FXML
    private TextField namaArtistMenu;

    @FXML
    private Button rentSelectedButtonMenu;

    @FXML
    private Button tambahButtonMenu;

    @FXML
    private TableColumn<Album, Integer> totalColumnMenu;

    @FXML
    private Button updateButtonMenu;

    @FXML
    void hapusButtonMenu(ActionEvent event) {
        try {
            for (Album i : dataAlbum) {
                if (i.getAlbumName() == albumName) {
                    dataAlbum.remove(i);
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Berhasil");
                    alert.setContentText("Berhasil menghapus data");
                    alert.showAndWait();
                    clearData();
                    break;
                }
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Gagal menghapus data");
            alert.showAndWait();
        }
    }

    @FXML
    void onClickTable(MouseEvent event) {
        try {
            if (event.getClickCount() == 1) {
                judulAlbumMenu.setText(String.valueOf(tableAlbum.getSelectionModel().getSelectedItem().getAlbumName()));
                // judulAlbumMenu.setDisable(true);
                namaArtistMenu.setText(String.valueOf(tableAlbum.getSelectionModel().getSelectedItem().getArtist()));
                jumlahDisewaMenu
                        .setText(String.valueOf(tableAlbum.getSelectionModel().getSelectedItem().getAvailable()));
                ;
                jumlahTotalMenu.setText(String.valueOf(tableAlbum.getSelectionModel().getSelectedItem().getTotal()));
                ;
            }
        } catch (Exception e) {
            // TODO: handle exception
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Tidak ada data");
            alert.setContentText("Silahkan masukkan data terlebih dahulu");
            alert.showAndWait();
        }
    }

    @FXML
    void rentSelectedButtonMenu(ActionEvent event) {
        try {
            Album albumTerpilih = tableAlbum.getSelectionModel().getSelectedItem();
            if (albumTerpilih != null) {
                if (albumTerpilih.getAvailable() > 0) {
                    albumTerpilih.setAvailable(albumTerpilih.getAvailable() - 1);
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Berhasil");
                    alert.setContentText("Berhasil meminjam album");
                    alert.showAndWait();
                    tableAlbum.refresh();
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Album habis");
                    alert.setContentText("Stok album habis");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("pilih album");
                alert.setContentText("Pilih album terlebih dahulu");
                alert.showAndWait();
            }
        } catch (Exception e) {
            // TODO: handle exception
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan dalam input data");
            alert.setContentText("Silahkan cek data yang Anda Masukkan");
            alert.showAndWait();
        }
    }

    @FXML
    void tambahButtonMenu(ActionEvent event) {
        boolean tidakAda = true;
        try {
            albumName = judulAlbumMenu.getText();
            artist = namaArtistMenu.getText();
            disewakan = Integer.valueOf(jumlahDisewaMenu.getText());
            total = Integer.valueOf(jumlahTotalMenu.getText());
            available = total - disewakan;
            Album newAlbum = new Album(albumName, artist, available, total);

            if (dataAlbum.isEmpty()) {
                dataAlbum.add(newAlbum);
                clearData();
            } else {
                for (Album album : dataAlbum) {
                    if (album.getAlbumName().equals(albumName) && album.getArtist().equals(artist)) {
                        tidakAda = false;
                        break;
                    }
                }
                if (tidakAda) {
                    dataAlbum.add(newAlbum);
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Berhasil");
                    alert.setContentText("Berhasil tambah data");
                    alert.showAndWait();
                    clearData();
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("Album dari Artist tersebut sudah ada");
                    alert.showAndWait();
                }
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan dalam input data");
            alert.setContentText("Silahkan cek data yang Anda Masukkan");
            alert.showAndWait();
        }
    }

    @FXML
    void updateButtonMenu(ActionEvent event) {
        try {
            Album albumTerpilih = tableAlbum.getSelectionModel().getSelectedItem();
            if (albumTerpilih != null) {
                albumTerpilih.setAlbumName(judulAlbumMenu.getText());
                albumTerpilih.setArtist(namaArtistMenu.getText());
                albumTerpilih.setAvailable(Integer.valueOf(jumlahDisewaMenu.getText()));
                albumTerpilih.setTotal(Integer.valueOf(jumlahDisewaMenu.getText()));
                tableAlbum.refresh();
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Berhasil");
                alert.setContentText("Berhasil mengupdate data");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("pilih album");
                alert.setContentText("Pilih album terlebih dahulu");
                alert.showAndWait();
            }
        } catch (Exception e) {
            // TODO: handle exception
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan dalam input data");
            alert.setContentText("Silahkan cek data yang Anda Masukkan");
            alert.showAndWait();
        }
    }

    public void clearData() {
        judulAlbumMenu.clear();
        namaArtistMenu.clear();
        jumlahDisewaMenu.clear();
        jumlahTotalMenu.clear();
    }

    public void initialize() {
        albumNameColumnMenu.setCellValueFactory(new PropertyValueFactory<Album, String>("albumName"));
        artistColumnMenu.setCellValueFactory(new PropertyValueFactory<Album, String>("artist"));
        availableColumnMenu.setCellValueFactory(new PropertyValueFactory<Album, Integer>("available"));
        totalColumnMenu.setCellValueFactory(new PropertyValueFactory<Album, Integer>("total"));

        tableAlbum.setItems(dataAlbum);

    }
}
