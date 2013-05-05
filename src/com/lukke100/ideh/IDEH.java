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

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author lukke
 *
 */
public class IDEH extends JavaPlugin {
	
	/* (non-Javadoc)
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		super.onEnable();
		PathGen path = new PathGen(this.getServer().getWorld("world"));
		path.runTaskTimer(this, 0, 1);
	}
	
	/* (non-Javadoc)
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 */
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

}
