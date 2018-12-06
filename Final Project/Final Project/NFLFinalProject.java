//Noah Canepa, this is my own work
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.control.cell.PropertyValueFactory;

public class NFLFinalProject extends Application
{
	NFLPlayer player;
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		//creates panes to place the various nodes
		
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(10);
		VBox vbox2 = new VBox(10);
		HBox hbox2 = new HBox(10);
		StackPane stackpane = new StackPane();
		//creates a new scene
		Scene scene = new Scene(hbox);
		//creates listview to show various options of players
		ListView listView = new ListView();
		listView.getItems().add("All Players");
		listView.getItems().add("Offensive Players");
		listView.getItems().add("DefensivePlayers");
		listView.getItems().add("Roster");
		listView.setPrefWidth(100);
		listView.setPrefHeight(75);
		//gives options for searching
		ChoiceBox choiceBox = new ChoiceBox();
		choiceBox.getItems().add("Search by Name");
		choiceBox.getItems().add("Search by Position");
		choiceBox.getItems().add("Age");
		//allows you to type in search bar
		Label label = new Label("Enter Search Value:");
		TextField textField = new TextField();
		//gets an image and places it inside the program
		FileInputStream input = new FileInputStream("C:/Users/Noah C/Pictures/Saved Pictures/NFL Draft homepage.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		//gives stats in the different tables for players
		TableView <NFLPlayer>tblAllPlayers = new TableView<>();
		TableColumn colName = new TableColumn("Name");
		TableColumn colPosition = new TableColumn("Position");
		TableColumn colAge = new TableColumn("Age");
		TableColumn colWeight = new TableColumn("Weight");
		//********************************************
		TableView <NFLPlayer>tblOff = new TableView();
		TableColumn colOffName = new TableColumn("Name");
		TableColumn colOffPosition = new TableColumn("Position");
		TableColumn colOffAge = new TableColumn("Age");
		TableColumn colOffWeight = new TableColumn("Weight");
		TableColumn colOffPassingYards = new TableColumn("PassingYards");
		TableColumn colOffReceivingYards = new TableColumn("ReceivingYards");
		TableColumn colOffRushingYards = new TableColumn("RushingYards");
		TableColumn colOffTouchdowns = new TableColumn("Touchdowns");
		//********************************************
		TableView <NFLPlayer>tblDef = new TableView();
		TableColumn colDefName = new TableColumn("Name");
		TableColumn colDefPosition = new TableColumn("Position");
		TableColumn colDefAge = new TableColumn("Age");
		TableColumn colDefWeight = new TableColumn("Weight");
		TableColumn colDefTackles = new TableColumn("Tackles");
		//********************************************
		TableView <NFLPlayer>tblRoster = new TableView();
		TableColumn colRosterName = new TableColumn("Name");
		TableColumn colRosterPosition = new TableColumn("Position");
		TableColumn colRosterAge = new TableColumn("Age");
		TableColumn colRosterWeight = new TableColumn("Weight");
		TableColumn colRosterTackles = new TableColumn("Tackles");
		TableColumn colRosterPassingYards = new TableColumn("PassingYards");
		TableColumn colRosterReceivingYards = new TableColumn("ReceivingYards");
		TableColumn colRosterRushingYards = new TableColumn("RushingYards");
		TableColumn colRosterTouchdowns = new TableColumn("Touchdowns");
		//shows stats in different columns
		tblAllPlayers.getColumns().addAll(colName, colPosition, colAge, colWeight);
		//*******************************************
		tblOff.getColumns().addAll(colOffName, colOffPosition, colOffAge, colOffWeight, colDefTackles);
		//*******************************************
		tblDef.getColumns().addAll(colDefName, colDefPosition, colDefAge, colDefWeight, colOffPassingYards, colOffReceivingYards, colOffRushingYards, colOffTouchdowns);
		//*******************************************
		tblRoster.getColumns().addAll(colRosterName, colRosterPosition, colRosterAge, colRosterWeight, colRosterTackles, colRosterPassingYards, colRosterReceivingYards, colRosterRushingYards, colRosterTouchdowns);
		/*********************************************/
		
		NFLPlayerManager managePlayerObject = new NFLPlayerManager();
		ObservableList<NFLPlayer> playerObj =FXCollections.observableArrayList(managePlayerObject.playerArray);
		tblAllPlayers.setItems(playerObj);
		//creates the stats for the different columns
		colName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Name"));
		colPosition.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Position"));
		colAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Age"));
		colWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Weight"));
		
		/********************************************************/
		colOffName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Name"));
		colOffPosition.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Position"));
		colOffAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Age")); 
		colOffWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Weight"));
		colOffPassingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("PassingYards"));
		colOffReceivingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("ReceivingYards"));
		colOffRushingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("RushingYards"));
		colOffTouchdowns.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Touchdowns"));
		
		colDefName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Name"));
		colDefPosition.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Position"));
		colDefAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Age"));
		colDefWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Weight"));
		colDefTackles.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Tackles"));
		
		colRosterName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Name"));
		colRosterPosition.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Position"));
		colRosterAge.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Age"));
		colRosterWeight.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Weight"));
		colRosterTackles.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Tackles"));
		colRosterPassingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("PassingYards"));
		colRosterReceivingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("ReceivingYards"));
		colRosterRushingYards.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("RushingYards"));
		colRosterTouchdowns.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Touchdowns"));
		
		
		//creates buttons for searching, offensive and defensive players, roster, and button to remove
		Button btnSearch = new Button("Search");
		Button btnDefensePlayer = new Button("Add to Defense Players");
		Button btnOffensePlayer = new Button("Add to Offense Players");
		Button btnAddRoster = new Button("Add to Roster");
		Button btnremove = new Button("Remove Selected");
		//adds nodes to the different panes
		vbox.getChildren().addAll(listView, choiceBox, label, textField, btnSearch, imageView);
		hbox2.getChildren().addAll(btnDefensePlayer, btnOffensePlayer, btnAddRoster, btnremove);
		vbox2.getChildren().addAll(stackpane, hbox2);
		stackpane.getChildren().addAll(tblOff, tblDef, tblRoster, tblAllPlayers);
		hbox.getChildren().addAll(vbox, vbox2);
		//displays interface
	primaryStage.setTitle("My Final Project");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	//allows the remove button to remove a player if clicked
	
	btnremove.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
	
		int index = listView.getSelectionModel().getSelectedIndex();
		
		if (index == 1) {
			player = tblDef.getSelectionModel().getSelectedItem();
			tblDef.getItems().remove(player);
			}
		else if(index == 2) {
			player = tblOff.getSelectionModel().getSelectedItem();
			tblOff.getItems().remove(player);
			}
		else if(index == 3) {
			player = tblRoster.getSelectionModel().getSelectedItem();
			tblRoster.getItems().remove(player);
			}
		}
	});
	//allows user to add player to offensive player when selected
	btnOffensePlayer.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			player = tblAllPlayers.getSelectionModel().getSelectedItem();
			tblDef.getItems().add(player);
			tblAllPlayers.getSelectionModel().clearSelection();
			}
         });
	//allows user to add player to defensive player when selected
	btnDefensePlayer.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			player = tblAllPlayers.getSelectionModel().getSelectedItem();
			tblOff.getItems().add(player);
			tblAllPlayers.getSelectionModel().clearSelection();
			}
		});
	//allows user to add player to their roster
	btnAddRoster.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			player = tblAllPlayers.getSelectionModel().getSelectedItem();
			tblRoster.getItems().add(player);
			tblAllPlayers.getSelectionModel().clearSelection();
			}
		});
	//makes the program only show certain lists when one is selected
	 listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
		public void handle(MouseEvent e) {
			int index = listView.getSelectionModel().getSelectedIndex();
			if (index ==0) {
				tblAllPlayers.setVisible(true);
				tblOff.setVisible(false);
				tblDef.setVisible(false);
				tblRoster.setVisible(false);
				}
			else if (index == 1) {
				tblDef.setVisible(true);
				tblOff.setVisible(false);
				tblAllPlayers.setVisible(false);
				tblRoster.setVisible(false);
			}
			else if (index == 2) {
				tblOff.setVisible(true);
				tblDef.setVisible(false);
				tblAllPlayers.setVisible(false);
				tblRoster.setVisible(false);
			}
			else if (index == 3) {
				tblRoster.setVisible(true);
				tblOff.setVisible(false);
				tblDef.setVisible(false);
				tblAllPlayers.setVisible(false);
			}
		}
	});
}
	//**********************************************
	public static void main(String[] args){
		Application.launch(args);
		}
}