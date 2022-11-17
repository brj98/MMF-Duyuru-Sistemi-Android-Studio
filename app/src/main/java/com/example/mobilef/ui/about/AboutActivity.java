package com.example.mobilef.ui.about;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mobilef.R;

import java.util.ArrayList;
import java.util.List;
import android.view.MenuItem;


public class AboutActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"Bilgisayar Mühendisliği","Bilgisayar Mühendisliği; temelde yazılım ve donanım başlıkları altında sistem tasarımı, yazılım, programlama, sistem yönetimi, veritabanı tasarımı ve yönetimi, bilgisayar ağları, donanım tasarımı gibi alanlarla ilgilenir. Bilgisayar mühendisleri, eğitimleri süresince algoritma tasarımı, programlama dilleri, web ve mobil temelli programlama, veritabanı, yazılım-donanım bütünleştirmesi gibi alanlarda gerek teorik, gerekse pratik bilgilerle donatılan bireylerdir. Ayrıca yapay zekâ, sinyal işleme, akıllı sistemler gibi alanlarda da çalışmalar yaparlar. Bu sorumluluk bilinci ile öğrencilere nitelikli ve çağdaş bilim anlayışı ile 4 yıllık süreçte kendisini gerçekleştirecek bir eğitim modeli oluşturulması amaçlanmaktadır."));
        list.add(new BranchModel(R.drawable.ic_biotech,"Biyomedikal Mühendisliği","Biyomedikal mühendisleri, modern toplumun karşılaştığı zor sorunlara yeni çözümler arayan sağlık hizmeti ekibinin nispeten yeni üyesi olarak hizmet vermektedir. Bu bölümün amacı, modern sağlık sisteminin şekillenmesinde teknolojinin rolüne geniş bir bakış açısı sağlamak, biyomedikal mühendislerinin oynadığı ana rolleri vurgulamak ve bu dinamik alandaki mesleki durumun görünümünü sunmaktır."));
        list.add(new BranchModel(R.drawable.ic_recycling,"Çevre Mühendisliği","Çevre Mühendisliği, çevre sağlığı problemlerinin çözümündeki düşünceyi ve uygulamaları açıkça ortaya koyan bir mühendislik dalı olarak; geniş halk kitlelerine güvenli ve lezzetli su temini, atık suların ve katı atıkların geri kazanımı veya bertarafı, halk sağlığı açısından şehirlerde ve kırsal alanlarda yeterli alt yapının kurulması, toprak, su ve atmosferde meydana gelen kirlenmelerin kontrolü ve bu problemlerin çözümündeki sosyal ve çevresel etkilerin dikkatli bir şekilde ele alınması, eklem bacaklılardan bulaşan hastalıkların kontrolü, endüstriyel tehlikeli atıkların bertarafı, şehirlerde, kırsal alanlarda, dinlenme ve eğlence yerlerinde yeterli sağlık koşullarının sağlanması gibi halk sağlığı alanındaki problemlerle ve çevredeki teknolojik gelişmelerin etkisinin tespiti ile ilgilenen bir mühendislik dalıdır."));
        list.add(new BranchModel(R.drawable.ic_baseline_electric_bolt_24,"Elektrik-Elektronik Mühendisliği","Bu program, Elektrik ve Elektronik Mühendisliği alanındaki tüm pratik ve teorik konuları kapsayarak, mezunlarına teknik ve yönetimsel beceriler kazandırmayı hedeflemektedir. Böylelikle, mezunların kontrol ve otomasyon sistemleri, elektrik makineleri, güç elektroniği, sinyal işleme, haberleşme, sayısal sistemler, mikrodalga ve bilgisayar ağları alanlarında, yazılım ve donanım alt sistemlerinin analiz, tasarım, geliştirme, uygulama, işletme ve bakımı konularında kariyer yapabilmelerini ve ileri düzeydeki çalışmaları takip edebilmeleri için yeterli matematiksel ve bilimsel altyapıya sahip olmalarını amaçlamaktadır."));
        list.add(new BranchModel(R.drawable.ic_virus,"Genetik ve Biyomühendislik","Genetik ve Biyomühendislik Bölümü, genetik ile biyomühendislik ve biyoteknoloji alanlarını birleştiren ve gen, protein, doku mühendisliği, moleküler biyoloji, biyoinformatik, protein kimyası ve mühendisliği ile kök hücre araştırmaları gibi temel biyomühendislik konularını içeren bir bilim dalıdır. Genetik ve Biyomühendisliğin amacı; matematik, fizik, kimya ve biyoloji gibi temel bilim alanlarındaki ilkeleri kullanarak, insanların yaşama kalitelerini arttırmaktır. Bunun için toplumun bugün ve gelecekteki ihtiyaçlarını esas alarak yeni bir kısım sistemlerin geliştirilmesi ve hizmet verilmesi çalışma alanlarını içermektedir. Kastamonu Üniveisitesi Mühendislik ve Mimarlık Fakültesi’ne bağlı olarak faaliyet gösteren Genetik ve Biyomühendislik Bölümü lisans programının amacı; temel biyomühendislik, moleküler biyoloji ve genetik bilimlerinin konularına hakim, ve bunların çeşitli alt dallarında teorik ve uygulamalı bilgilerle donatılmış, toplumsal ihtiyaçlara çözümler üretmeyi hedefleyen, araştırma ve geliştirmeye önem veren ve hayat boyu öğrenmenin önemini benimsemiş yüksek donanımlı, problem çözme kabiliyeti yüksek ve sorumluluk üstlenebilen moleküler biyologlar ve biyomühendisler yetiştirmektir."));
        list.add(new BranchModel(R.drawable.ic_fastfood,"Gıda Mühendisliği","İnovatif bakış açısına sahip, problem tespit etme ve çözme odaklı çalışan, alanında yapılan güncel araştırmaları takip eden, çalıştığı kurum/ kuruluşa değer katacak donanım ve bilgiye sahip, kamu ve özel sektörde önemli pozisyonlara gelecek gıda mühendisleri yetiştirerek ülkemiz gıda sektörünün gelişmesine katkıda bulunmak."));
        list.add(new BranchModel(R.drawable.ic_apart,"İnşaat Mühendisliği","İnşaat mühendisliği bölümü her türlü bina, baraj, havaalanı, köprü, yol, su kemerleri, liman, tünel, enerji istasyonları, demiryolu, hızlı tren projeleri, kanallar, boru hatları, kanalizasyon, su şebekesi vb. hizmet ve endüstri yapılarının planlanması, projelendirilmesi, yapımı ve denetimi ile ilgili eğitimi içermektedir. Öğrencilerin mezun olduklarında malzeme ve tekniği en iyi şekilde bir araya getirebilen, emniyet, ekonomi ve estetiği göz önünde bulundurarak mühendislik hizmeti verebilen mühendisler olmaları adına teknik bir eğitim hedeflenmektedir. Öğrenciler lisans eğitimlerinin ilk iki yılında, ağırlıklı olarak mühendislik eğitimleri için gerekli olan temel fen dersleri ile temel mühendislik derslerini alacaktır. Üçüncü ve dördüncü yıllarında ise inşaat mühendisliği eğitiminin yapı, mekanik, hidrolik, ulaştırma ve geoteknik anabilim dalları ile ilgili dersleriyle tanışacaktır. Böylece mesleki eğitimlerinde teknik seçmeli derslerle istedikleri alana yönelebilecek ve ayrıca mühendislik eğitimi dışında sosyal seçmeli derslerle de merak ettikleri konularda bilgilerini artırabilecektir."));
        list.add(new BranchModel(R.drawable.ic_mech,"Makine Mühendisliği","Makine Mühendisliği mühendisliğin eski disiplinlerden biridir. Bu bölüm her türlü makinenin ve makine elemanlarının belirli kriterler çerçevesinde tasarımını yapan, geliştiren, üretimini planlayan, üretim teknolojilerini geliştiren, sistemler arası ilişkileri kuran mühendislik eğitimlerini içerir. Genel olarak makine mühendisi çalışma alanlarında üç ana işlevi üstlenir. Bunlar; tasarım, üretim yönetimlerini geliştirme, üretimi planlama ve uygulama. Genellikle makine mühendisi ucuz ve kullanışlı mekanik sistemlerin, gaz ve buhar türbinlerinin, pistonlu kompresörlerin, soğutma, ısıtma, havalandırma sistemlerinin, içten yanmalı motorların, nükleer reaktörlerin tasarımı, geliştirilmesi ve üretiminde görev alır. Kastamonu Üniversitesi Mühendislik ve Mimarlık Fakültesi Makine Mühendisliği Bölümü 2015-2016 eğitim öğretim yılında eğitim-öğretime başlamıştır."));
        list.add(new BranchModel(R.drawable.ic_build,"Metalurji ve Malzeme Mühendisliği","Metalurji ve Malzeme Mühendisliği, temel bilim ve mühendislik uygulamalarının birleştiği, inorganik ve organik kökenli doğal veya sentetik hammaddelerden başlayarak metal, seramik ve polimer esaslı mühendislik malzemelerinin ve nanomalzemelerin tasarlanmasını, geliştirilmesini, üretilmesini ve bunların özelliklerinin çeşitli sanayi dallarındaki teknik ihtiyaçlara uyarlanmasını konu alır. Disiplinlerarası bir alan olup, tüm mühendislik dalları, biyomedikal ve biyoteknoloji alanları, diş hekimliği, tıp gibi alanlarla yakın ilişki içindedir.nsanlar tüm zamanlar içinde sürekli çevresi ile etkileşimde bulunmuş, yaşadığı zamana göre çevresinde bulunan çeşitli malzemeleri kendi ihtiyaçları çerçevesinde kullanmaya çalışmıştır. Günümüzde de sürdürülen mühendislik çalışmaları sürekli olarak yeni malzemelerin geliştirilmesi üzerinedir ve her gelişme malzeme alanındaki gelişme ile paralel olmaktadır. Bu çalışmalar yapay insan dokularından, elektronik malzemelere ve nanomalzemelere kadar çok geniş bir alanda sürdürülmektedir.Metalurji ve Malzeme Mühendisliği, her çeşit malzemenin atomik ve moleküler düzeydeki yapılarının incelenmesi yanında, makroskopik düzeydeki özellikleri ve karakterizasyonları üzerine eğitim vermektedir ve bu alandaki tek mühendislik programıdır. Yeni malzemelerin geliştirilmesi yanında mevcutların daha güvenli, sağlıklı ve emniyetli olmalarını sağlayacak üretim süreçleri ile de ilgilidir. Havacılık başta olmak üzere, savunma, enerji, haberleşme ve otomotiv sanayii gibi birçok gelişen sektörün giderek artan ihtiyaçları üstün performanslı, nanofonksiyonel yeni malzemelerin geliştirilmesini zorunlu hale getirmiştir. Bunun sonucunda polimerler, seramikler ve kompozitler, konvensiyonel metalik malzemelerin yanında yerini almış ve mühendislik malzemelerini büyük ölçüde zenginleştirmiştir. Tüm bu gelişmeler karşısında, insanlık tarihi boyunca geliştirilmiş olan geleneksel malzemelerin, bir taraftan özelliklerinin daha da iyileştirilmesi, diğer taraftan yeni ve yaratıcı yaklaşımlarla alternatiflerinin geliştirilmesi kaçınılmazdır."));
        list.add(new BranchModel(R.drawable.ic_forest,"Peyzaj Mimarlığı","Peyzaj Mimarlığı, çevre, tasarım, sanat ve bilimin birleşimi olarak tanımlanmaktadır. Kentsel ve kırsal dış mekandaki her şey, insan ve doğal sistemler arasındaki tüm etkileşimler, Peyzaj Mimarlığının içerisindedir. Peyzaj Mimarlığı bölümü, hızlı bir kentleşme sonucunda bozulan çevrenin, insan gereksinmeleri doğrultusunda ekonomik, işlevsel, ekolojik ve estetik ölçülere uygun olarak planlanması, düzenlenmesi, korunması ve geliştirilmesi, kentsel ve kırsal yeşil alan ve rekreasyon planlamaları konularında çalışabilecek insan gücünü yetiştirmeyi amaçlamaktadır."));
        setTitle("Hakkımızda");

        adapter = new BranchAdapter(AboutActivity.this,list);

        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = findViewById(R.id.college_image);

        Glide.with(AboutActivity.this).load(R.drawable.mmf).into(imageView);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}