/*
 * Copyright (c) 2011 Kurt Aaholst <kaaholst@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.org.ngo.squeezer.itemlist;

import android.view.View;

import java.util.EnumSet;

import uk.org.ngo.squeezer.framework.BaseItemView;
import uk.org.ngo.squeezer.framework.BaseListActivity;
import uk.org.ngo.squeezer.model.Plugin;
import uk.org.ngo.squeezer.util.ImageFetcher;

public abstract class PluginView extends BaseItemView<Plugin> {

    public PluginView(BaseListActivity<Plugin> activity) {
        super(activity);

        setViewParams(EnumSet.of(ViewParams.ICON));
    }

    @Override
    public void bindView(View view, Plugin item, ImageFetcher imageFetcher) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();

        viewHolder.text1.setText(item.getName());
        imageFetcher.loadImage(getActivity().getIconUrl(item.getIcon()), viewHolder.icon);
    }
}
