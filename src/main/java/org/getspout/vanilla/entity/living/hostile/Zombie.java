/*
 * This file is part of Vanilla (http://www.getspout.org/).
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.vanilla.entity.living.hostile;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entity.HostileEntity;
import org.getspout.vanilla.entity.living.Land;
import org.getspout.vanilla.entity.living.Monster;
import org.getspout.vanilla.mobs.EntityID;

public class Zombie extends Monster implements HostileEntity, Land {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata(EntityID.KEY, new MetadataStringValue(EntityID.Zombie.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}
}