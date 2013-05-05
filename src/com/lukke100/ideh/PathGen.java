/**
 * Copyright (C) 2013 Lucas Hart and Adam McCarthy
 * 
 * This file is part of iDontEvenHouses
 * 
 * iDontEvenHouses is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * iDontEvenHouses is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with iDontEvenHouses.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.lukke100.ideh;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author lukke
 *
 */
public class PathGen extends BukkitRunnable {
	
	private final World world;
	private Random random;
	private transient int x;
	private transient int z;
	private transient int y;
	private ArrayList<Material> change;
	
	public PathGen(World world){
		this.world = world;
		change = new ArrayList<Material>();
		change.add(Material.GRASS);
		change.add(Material.STONE);
		change.add(Material.DIRT);
		change.add(Material.SAND);
		random = new Random();
	}
	
	private void nextLocation(){
		x = random.nextInt(200) - 100;
		z = random.nextInt(200) - 100;
	}
	
	private Location topReplacable(){
		y = world.getHighestBlockYAt(x, z);
		while(!change.contains(world.getBlockAt(x, y, z).getType())){
			y -= 1;
		}
		return new Location(world, x, y, z);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		/*
		 * TODO Implement a method that will create a single block that is part of the path.
		 * This will be the method that is called repeatedly to generate the path.
		 */
		nextLocation();
		world.getBlockAt(topReplacable()).setType(Material.COBBLESTONE);
		
	}

}
