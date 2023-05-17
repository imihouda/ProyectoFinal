import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            
            ClubDao clubDao = new ClubDao();
            FutbolistaDao futbolistaDAO = new FutbolistaDao();
            AsociasionDao asociacionDAO = new AsociasionDao();
            
            Club club = new Club(1, "FC Barcelona", 1899, "Camp Nou");
            clubDao.insertClub(club);
       
            Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 1987, "Argentina", "12345678");
            futbolistaDAO.insertFutbolista(futbolista);
 
            asociacionDAO.asociarFutbolistaClub(futbolista.getIdFutbolista(), club.getIdClub());
     
            List<Futbolista> futbolistasClub = asociacionDAO.getFutbolistasByClub(club.getIdClub());

            List<Club> clubsFutbolista = asociacionDAO.getClubsByFutbolista(futbolista.getIdFutbolista());
     
            List<Club> todosClubs = clubDao.getAllClubs();
 
            List<Futbolista> todosFutbolistas = futbolistaDAO.getAllFutbolistas();
       
            
        } catch (SQLException e) {
            e.printStackTrace();
       
        }
    }
}
