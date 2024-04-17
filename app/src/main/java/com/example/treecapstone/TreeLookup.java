package com.example.treecapstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.treecapstone.databinding.ActivityTreelookupBinding;

import java.util.ArrayList;

public class TreeLookup extends AppCompatActivity {

    ActivityTreelookupBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTreelookupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId ={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s};

        String[] name = {"Western red ceder","Common douglus-fir","Bigleaf maple","Indian plum","Japanese maple","Sweet cherry","Vine maple","Apple","Pacific madrone","Common hawthron","Red alder","Common lilac","Common holly","European mountain-ash","Western hemlock","Cherry plum","Kousa dogwood","Western serviceberry","Rose of sharon" };

        String[] sciName = {"Thuja plicata","Pseudotsuga menziesii","Acer macrophyllum","Oemleria cerasiformis","Acer palmatum","Prunus avium","Acer circinatum","Malus domestica","Arbustus menziesii","Crataegus monogyna","Alnus rubra","Syringa vulgaris","llex aquifolium","Sorbus aucuparia","Tsuga heterophylla","Prunus cerasifera","Cornus kousa","Amelanchier alnifolia","Hibiscus syriacus"};

        String[] fact = {"is a cedar tree species native to the western United States. Despite its name, the western red cedar is not considered a true cedar. Instead, it belongs to the Cypress family. This species is commercially used to make decks, siding, and the soundboards of guitars.","The Common douglas-fir is named after Scottish botanist David Douglas, who discovered it. Small mammals rely heavily on the seeds for nutrition. Many Native American tribes utilized the bark, resin, and pine needles to prepare herbal remedies for various ailments. Common douglas-fir is often used in heavy timber buildings due to its sturdy wood.","as its name implies, is known for its large leaves. The wood is commercially used to produce a variety of products like furniture, guitars, and gun stocks. Bigleaf maple syrup is not as well-known or well-liked as that made from sugar maple trees, but can be produced just as easily."," is a small shrub with purple bark. This species grows in sunny locations and sparsely in shady areas. In the springtime, clumps of white flowers appear on the indian plum. Following the flowers, this plant produces a peach-colored fruit.","A woody plant native to East Asia, the japanese maple features hand-shaped leaves with five-pointed lobes that resemble the palm of a hand. It has been cultivated for millennia in Japan for bonsai creation. Extracts from the branches and leaves of this plant are used as medicine in Chinese traditional medicine.","Sweet cherry is a well-known species to fruit lovers worldwide. This stone fruit varies in flavor from sweet to tart, depending on the specific cultivar. Sweet cherry is also used for lumber and is a preferred wood type for furniture.","is a maple tree native to western Northern America, especially the California coast. Vine maple normally grows in the wild but is occasionally cultivated for ornamental purposes. The tree bends over easily and can grow into the ground.","Apple is the most widely cultivated tree fruit around the globe. The three top apple-producing countries are China, the United States, and Poland with an economic impact of $3.55 billion in 2017. There are more than 7,500 known cultivars of apples throughout the world.","Pacific madrone is an evergreen tree whose distinguishing feature is its copper-colored bark that when mature naturally peels away from the trunk of the tree. After the mature bark peels off in sheets, it leaves a smooth, satiny surface that is silver-green colored. The pacific madrone produces flowers in spring, followed by berries in autumn.","s a flowering tree that is actually part of the rose family. It is not unusual in garden settings and arranged as hedges. Examples of famous common hawthorn trees include the apocryphal oldest tree in France, and a well-known hawthorn in England that stood out for flowering three times a year.","The red alder, one of the world's largest alders, takes its common name from the vibrant reddish color that emerges in its bruised or scraped bark. The various parts of this tree have multiple uses. Native Americans use the bark of this tree to make dye and medicine. Its wood is used in construction and furniture.","Common lilac is a shrub native to the Balkan Peninsula that blooms with a fragrant blossom. It grows on rocky terrain and has a suckering habit. The blossoms are used to flavor honey, sugars, food, and other delights and farmed for its fragrant flowers in the spring.","is an evergreen tree or shrub, recognized by the characteristic shape of its leaves and bright red berries. Its natural habitat is understories of oak and beech forests. Common holly is widely used in landscaping in temperate regions. Thick crown and prickly leaves make this plant excellent for hedges.","Sorbus aucuparia, also known as european mountain-ash, is a deciduous tree native to Europe. It grows a slim trunk with upward-curving branches as it matures. Its admirable upright and dense branching gives the plant an oval crown. The juicy and soft clustered fruits are an excellent source of food for birds, while its yellow to plum foliage adds to its overall aesthetic appeal.","is a hemlock tree species native to North America. Western hemlock is planted throughout California and other regions for ornamental purposes as well as forestry.","is a deciduous small tree or shrub native to Southern Europe and Western Asia. It is one of the most common wild fruits of its native region, producing numerous rounded, yellow, red, or burgundy-colored sweet juicy fruit in summer and autumn. Cherry plum is also used as an ornamental tree and as rootstock for other Prunus species.","he kousa dogwood is known for its ornamental appeal. The showy flowers and bark, as well as the lovely fall foliage, make this vase-shaped tree a great addition to your patio, yard, or lawn. The tree matures to about 9 m high and is often just as wide.","A large shrub with edible berries, the western serviceberry is both beautiful and delicious. Pretty white flowers appear first, followed by green leaves which turn to yellowish red in the fall. Berries appear in late summer and turn a deep blue shade when ripe.","Hibiscus syriacus is a deciduous shrub with trumpet-shaped pink, lavender, or white flowers. Although it was first collected by Western botanists from Syrian gardens, “rose of sharon” is native to south-central and southeastern China. Because of its hardiness and prolific blooming, it is cultivated all around the world. It is the national flower of South Korea, mentioned in its national anthem."};

        String[] healthFact = {"Health issues: Die back and Branch blight","Health issues: Lognhorn beetles, Fire ants","Health issues: Brown spots, Plant dried up, Scars, fruit weathering.","Health issues: catapillers, brown spots, Nutreuent deficnines","Health issues: Thrips, Wiliting, Leaf blight, powdery mildew, leaf rot, brown blotch.","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: ","Health issues: "};

        ArrayList<Tree> treeArrayList = new ArrayList<>();

        for(int i = 0; i <imageId.length;i++){
            Tree tree = new Tree(name[i],sciName[i],fact[i],healthFact[i],imageId[i]);
            treeArrayList.add(tree);
        }

        TreeAdapter treeAdapter = new TreeAdapter(TreeLookup.this,treeArrayList);

        binding.listview.setAdapter(treeAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                //Intent intent = new Intent(TreeLookup.this, TreeActivity.class)
                Intent i = new Intent(TreeLookup.this, TreeActivity.class);
                i.putExtra("imageId",imageId[position]);
                i.putExtra("name",name[position]);
                i.putExtra("sciName",sciName[position]);
                i.putExtra("facts",fact[position]);
                i.putExtra("healthFacts",healthFact[position]);
                startActivity(i);
            }
        });

    }
}
