import java.io.*;
import java.util.Scanner;
public class NotesApp{
    private static final String FILE_NAME="notes.txt";
    //write notes to file
    public static void writeNote(String note){
        try(FileWriter fw=new FileWriter(FILE_NAME,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter out=new PrintWriter(bw)){
                out.println(note);
                out.flush();
                System.out.println("Note saved successfully!");
            }
            catch(IOException e){
                System.out.println("An error occurred while saving the note.");
                e.printStackTrace();
            }
            }
    //read all notes from file
    public static void readNotes(){
        try(FileReader fr=new FileReader(FILE_NAME);
            BufferedReader br=new BufferedReader(fr)){
                String line;
                System.out.println("\n Your Notes:");
                while((line=br.readLine())!=null){
                    System.out.println("-"+line);
                }
            }catch(FileNotFoundException e){
                System.out.println("No notes found yet.Add some notes first!");
            }catch(IOException e){
                System.out.println("an error occured while reading notes.");
                e.printStackTrace();
            }
            }
            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int choice;
                do{
                    System.out.println("\n...Notes App...");
                    System.out.println("1.Add Note");
                    System.out.println("2.view Notes");
                    System.out.println("3.Exit");
                    System.out.println("Enter your choice: ");
                    choice=sc.nextInt();
                    sc.nextLine();
                    switch(choice){
                        case 1:
                            System.out.print("Enter your note: ");
                            String note=sc.nextLine();
                            writeNote(note);
                            break;
                        case 2:
                            readNotes();
                            break;
                        case 3:
                            System.out.println("Exiting Notes App.GoodBye!");
                            break;
                        default:
                            System.out.println("Invalid choice!please try again.");
                        }
                    }while(choice !=3);
                    sc.close();
                }
            }




                                                                    

                                                                                
                                                                            
                                                                        
                                                                
                                                        

                                                    