package net.runelite.client.plugins.questitemcheck;

import javax.inject.Inject;

import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.bankvalue.BankValueConfig;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.util.QueryRunner;

@PluginDescriptor(
        name = "Quest Item Check",
        description = "Helps quickly identify if you have a item needed for a quest either within your bank or inventory",
        tags = {"external", "integration", "notifications", "quest", "items"}
)

class QuestItemCheckPlugin{
    @Inject
    private ClientToolbar clientToolbar;

    @Inject
    private QuestItemCheckConfig config;

    private final QueryRunner queryRunner;
    private final ItemManager itemManager;

    //class constructor
    @Inject
    QuestItemCheckPlugin(QueryRunner queryRunner, ItemManager itemManager)
    {
        this.queryRunner = queryRunner;
        this.itemManager = itemManager;
    }
}
