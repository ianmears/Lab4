package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;
	private UUID randID;

	// Change this from ArrayList to HashMap.
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	private HashMap TablePlayers1 = new HashMap<UUID,Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		// TODO: Lab #4 Add a player to the table (should be pretty easy)
		TablePlayers1.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		// TODO: Lab #4 Remove a player from the table
		TablePlayers1.remove(p.getPlayerID(), p);
		return this;
	}
	
	public HashMap<UUID,Player> TableNumber(){
		return this.TablePlayers1;
	}
}
