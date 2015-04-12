package techreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import techreborn.items.ItemDusts;
import techreborn.items.ItemGems;
import techreborn.items.ItemIngots;
import techreborn.items.ItemParts;
import techreborn.util.LogHelper;

public class ModItems {
	
    public static Item dusts;
    public static Item ingots;
    public static Item gems;
    public static Item parts;

    public static void init()
    {
    	dusts = new ItemDusts();
        GameRegistry.registerItem(dusts, "dust");
        ingots = new ItemIngots();
        GameRegistry.registerItem(ingots, "ingot");
        gems = new ItemGems();
        GameRegistry.registerItem(gems, "gem");
        parts = new ItemParts();
        GameRegistry.registerItem(parts, "part");
		LogHelper.info("TechReborns Items Loaded");

        registerOreDict();
    }
    
    public static void registerOreDict()
    {
    	//Dusts
    	OreDictionary.registerOre("dustAlmandine", new ItemStack(dusts,1,0));
    	OreDictionary.registerOre("dustAluminium", new ItemStack(dusts,1,1));
    	OreDictionary.registerOre("dustAndradite", new ItemStack(dusts,1,2));
    	OreDictionary.registerOre("dustBasalt", new ItemStack(dusts,1,4));
    	OreDictionary.registerOre("dustBauxite", new ItemStack(dusts,1,5));
    	OreDictionary.registerOre("dustBrass", new ItemStack(dusts,1,6));
    	OreDictionary.registerOre("dustBronze", new ItemStack(dusts,1,7));
    	OreDictionary.registerOre("dustCalcite", new ItemStack(dusts,1,8));
    	OreDictionary.registerOre("dustCharcoal", new ItemStack(dusts,1,9));
    	OreDictionary.registerOre("dustChrome", new ItemStack(dusts,1,10));
    	OreDictionary.registerOre("dustCinnabar", new ItemStack(dusts,1,11));
    	OreDictionary.registerOre("dustClay", new ItemStack(dusts,1,12));
    	OreDictionary.registerOre("dustCoal", new ItemStack(dusts,1,13));
    	OreDictionary.registerOre("dustCopper", new ItemStack(dusts,1,14));
    	OreDictionary.registerOre("dustDiamond", new ItemStack(dusts,1,16));
    	OreDictionary.registerOre("dustElectrum", new ItemStack(dusts,1,17));
    	OreDictionary.registerOre("dustEmerald", new ItemStack(dusts,1,18));
    	OreDictionary.registerOre("dustEnderEye", new ItemStack(dusts,1,19));
    	OreDictionary.registerOre("dustEnderPearl", new ItemStack(dusts,1,20));
    	OreDictionary.registerOre("dustEndstone", new ItemStack(dusts,1,21));
    	OreDictionary.registerOre("dustFlint", new ItemStack(dusts,1,22));
    	OreDictionary.registerOre("dustGold", new ItemStack(dusts,1,23));
    	OreDictionary.registerOre("dustGreenSapphire", new ItemStack(dusts,1,24));
    	OreDictionary.registerOre("dustGrossular", new ItemStack(dusts,1,25));
    	OreDictionary.registerOre("dustInvar", new ItemStack(dusts,1,26));
    	OreDictionary.registerOre("dustIron", new ItemStack(dusts,1,27));
    	OreDictionary.registerOre("dustLazurite", new ItemStack(dusts,1,28));
    	OreDictionary.registerOre("dustLead", new ItemStack(dusts,1,29));
    	OreDictionary.registerOre("dustMagnesium", new ItemStack(dusts,1,30));
    	OreDictionary.registerOre("dustMarble", new ItemStack(dusts,31));
    	OreDictionary.registerOre("dustNetherrack", new ItemStack(dusts,32));
    	OreDictionary.registerOre("dustNickel", new ItemStack(dusts,1,33));
    	OreDictionary.registerOre("dustObsidian", new ItemStack(dusts,1,34));
    	OreDictionary.registerOre("dustOlivine", new ItemStack(dusts,1,35));
    	OreDictionary.registerOre("dustPhosphor", new ItemStack(dusts,1,36));
    	OreDictionary.registerOre("dustPlatinum", new ItemStack(dusts,1,37));
    	OreDictionary.registerOre("dustPyrite", new ItemStack(dusts,1,38));
    	OreDictionary.registerOre("dustPyrope", new ItemStack(dusts,1,39));
    	OreDictionary.registerOre("dustRedGarnet", new ItemStack(dusts,1,40));
    	OreDictionary.registerOre("dustRedrock", new ItemStack(dusts,1,41));
    	OreDictionary.registerOre("dustRuby", new ItemStack(dusts,1,42));
    	OreDictionary.registerOre("dustSaltpeter", new ItemStack(dusts,1,43));
    	OreDictionary.registerOre("dustSapphire", new ItemStack(dusts,1,44));
    	OreDictionary.registerOre("dustSilver", new ItemStack(dusts,1,45));
    	OreDictionary.registerOre("dustSodalite", new ItemStack(dusts,1,46));
    	OreDictionary.registerOre("dustSpessartine", new ItemStack(dusts,1,47));
    	OreDictionary.registerOre("dustSphalerite", new ItemStack(dusts,1,48));
    	OreDictionary.registerOre("dustSteel", new ItemStack(dusts,1,49));
    	OreDictionary.registerOre("dustSulfur", new ItemStack(dusts,1,50));
    	OreDictionary.registerOre("dustTin", new ItemStack(dusts,1,51));
    	OreDictionary.registerOre("dustTitanium", new ItemStack(dusts,1,52));
    	OreDictionary.registerOre("dustTungsten", new ItemStack(dusts,1,53));
    	OreDictionary.registerOre("dustUranium", new ItemStack(dusts,1,54));
    	OreDictionary.registerOre("dustUvarovite", new ItemStack(dusts,1,55));
    	OreDictionary.registerOre("dustYellowGarnet", new ItemStack(dusts,1,56));
    	OreDictionary.registerOre("dustZinc", new ItemStack(dusts,1,57));
    	//Ingots
    	OreDictionary.registerOre("ingotInvar", new ItemStack(ingots,1,16));

    }

}