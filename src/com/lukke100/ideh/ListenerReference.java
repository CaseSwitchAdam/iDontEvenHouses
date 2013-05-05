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

import org.bukkit.event.Listener;

/**
 * @author lukke
 *
 */
public class ListenerReference implements Listener {
	public ListenerReference(IDEH plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

}
