package techreborn.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import techreborn.client.TechRebornCreativeTabMisc;
import techreborn.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import techreborn.init.ModBlocks;

public class BlockOre extends Block {

	public static ItemStack getOreByName(String name, int count)
	{
		int index = -1;
		for (int i = 0; i < types.length; i++) {
			if (types[i].equals(name)) {
				index = i;
				break;
			}
		}
		return new ItemStack(ModBlocks.ore, count, index);
	}
	
	public static ItemStack getOreByName(String name)
	{
		return getOreByName(name, 1);
	}

	public static final String[] types = new String[]
	{ "Galena", "Iridium", "Ruby", "Sapphire", "Bauxite", "Pyrite", "Cinnabar",
			"Sphalerite", "Tungston", "Sheldonite", "Peridot", "Sodalite",
			"Tetrahedrite", "Cassiterite", "Lead", "Silver" };

	private IIcon[] textures;

	public BlockOre(Material material)
	{
		super(material);
		setBlockName("techreborn.ore");
		setCreativeTab(TechRebornCreativeTabMisc.instance);
		setHardness(1f);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		if (meta == 2)
		{
			return new ItemStack(ModItems.gems, fortune, 0).getItem();
		}
		if (meta == 3)
		{
			return new ItemStack(ModItems.gems, fortune, 1).getItem();
		}
		if (meta == 5)
		{
			return new ItemStack(ModItems.dusts, fortune, 60).getItem();
		}
		return Item.getItemFromBlock(this);
	}
		
    @Override
    protected boolean canSilkHarvest() 
    {
        return true;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int meta = 0; meta < types.length; meta++)
		{
			list.add(new ItemStack(item, 1, meta));
		}
	}

	@Override
	public int damageDropped(int metaData)
	{
		if(metaData == 2 )
		{
			return 0;
		}
		else if(metaData == 3)
		{
			return 1;
		}
		else if(metaData == 5)
		{
			return 60;
		}
		return metaData;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.textures = new IIcon[types.length];

		for (int i = 0; i < types.length; i++)
		{
			textures[i] = iconRegister.registerIcon("techreborn:" + "ore/ore"
					+ types[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metaData)
	{
		metaData = MathHelper.clamp_int(metaData, 0, types.length - 1);

		if (ForgeDirection.getOrientation(side) == ForgeDirection.UP
				|| ForgeDirection.getOrientation(side) == ForgeDirection.DOWN)
		{
			return textures[metaData];
		} 
		else
		{
			return textures[metaData];
		}
	}

}
