import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 1000, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 1100, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket2, ticket1, ticket4, ticket6, ticket8};
        Ticket[] actual = manager.findAll("MSK", "SPB");
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSortTickets2() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "NEW", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", " UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "LA", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", " LA", 200, 130);
        Ticket ticket7 = new Ticket(7, "MSK", "SPB", 300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "LA", 500, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("LA", "SPB");
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSortTickets3() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "NEW", 200, 93);
        Ticket ticket2 = new Ticket(2, "LA", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", " UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "LA", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", " LA", 200, 130);
        Ticket ticket7 = new Ticket(7, "LA", "SPB", 300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "LA", 500, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket2, ticket7};
        Ticket[] actual = manager.findAll("LA", "SPB");
        Assertions.assertArrayEquals(expected, actual);


    }
}
