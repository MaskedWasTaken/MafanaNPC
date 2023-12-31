package me.tahacheji.mafana.data;

import me.tahacheji.mafana.MafanaNPC;
import net.citizensnpcs.api.event.NPCClickEvent;
import net.citizensnpcs.api.event.NPCLeftClickEvent;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface NPCTaskEvents {


    default boolean onArrivalLocation(MafanaTask mafanaTask, MafanaCitizens npc, Location v1) {
        return false;
    }
    default boolean onArrivalPlayer(MafanaTask mafanaTask, MafanaCitizens npc, Player v1) {
        return false;
    }

    default boolean onArrivalNPC(MafanaTask mafanaTask, MafanaCitizens npc, MafanaCitizens v1) {
        return false;
    }

    default boolean onArrivalBlock(MafanaTask mafanaTask, MafanaCitizens npc, Material v1, Block block) {
        return false;
    }

    default boolean rightClickNPC(NPCRightClickEvent event, MafanaStillNPC mafanaStillNPC, Player player) {
        return false;
    }

    default boolean leftClickNPC(NPCLeftClickEvent event, MafanaStillNPC mafanaStillNPC, Player player) {
        return false;
    }

    default boolean clickNPC(NPCClickEvent event, MafanaStillNPC mafanaStillNPC, Player player) {
        return false;
    }

}
