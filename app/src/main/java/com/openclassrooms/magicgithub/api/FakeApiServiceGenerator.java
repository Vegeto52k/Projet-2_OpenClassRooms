package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://avatarfiles.alphacoders.com/230/230571.jpg"),
            new User("002", "Paul", "https://avatarfiles.alphacoders.com/230/230570.jpg"),
            new User("003", "Phil", "https://avatarfiles.alphacoders.com/230/230575.jpg"),
            new User("004", "Guillaume", "https://avatarfiles.alphacoders.com/230/230576.jpg"),
            new User("005", "Francis", "https://avatarfiles.alphacoders.com/230/230577.jpg"),
            new User("006", "George", "https://avatarfiles.alphacoders.com/230/230578.jpg"),
            new User("007", "Louis", "https://avatarfiles.alphacoders.com/230/230581.jpg"),
            new User("008", "Mateo", "https://avatarfiles.alphacoders.com/230/230583.jpg"),
            new User("009", "April", "https://avatarfiles.alphacoders.com/230/230588.jpg"),
            new User("010", "Louise", "https://avatarfiles.alphacoders.com/230/230591.jpg"),
            new User("011", "Elodie", "https://avatarfiles.alphacoders.com/230/230599.jpg"),
            new User("012", "Helene", "https://avatarfiles.alphacoders.com/230/230500.jpg"),
            new User("013", "Fanny", "https://avatarfiles.alphacoders.com/230/230501.jpg"),
            new User("014", "Laura", "https://avatarfiles.alphacoders.com/230/230503.jpg"),
            new User("015", "Gertrude", "https://avatarfiles.alphacoders.com/230/230507.jpg"),
            new User("016", "Chloé", "https://store-images.s-microsoft.com/image/apps.39852.14455250034361967.824623c3-91b6-402f-9a68-c66bfac9bc20.7bfae929-5b2a-4efe-9639-5ffd1e2de297?mode=scale&q=90&h=720&w=1280&background=%23FFFFFF"),
            new User("017", "April", "https://www.breakflip.com/uploads2/Azilliz/2021/Juillet/Fortnite/fortnite-naruto-skin.jpg"),
            new User("018", "Marie", "https://img.redbull.com/images/c_limit,w_1500,h_1000,f_auto,q_auto/redbullcom/2021/2/25/k9jy66qhgcxbsv3lwupb/viego-champion-league-of-legends-guide"),
            new User("019", "Henri", "https://www.sortiraparis.com/images/80/66131/626935-kena-bridge-of-spirits-sur-ps5-la-nouvelle-bande-annonce.jpg"),
            new User("020", "Rémi", "https://static.wikia.nocookie.net/lemondededisney/images/5/55/Doctor_Strange.jpg/revision/latest?cb=20200223193338&path-prefix=fr")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://pbs.twimg.com/profile_images/1410917768749371392/UfrKjLc0_400x400.jpg"),
            new User("022", "Geoffrey", "https://img-4.linternaute.com/Wu-o_izO10X1oZ8Zgd0LxX1jwq8=/1240x/smart/726cc36bfc034ab89ab0b52d4b9e1c9d/ccmcms-linternaute/10676149.jpg"),
            new User("023", "Simon", "https://static.wikia.nocookie.net/frstarwars/images/3/32/Dark_Vador.jpg/revision/latest?cb=20160426120153"),
            new User("024", "André", "https://www.20ansharrypotter.fr/wp-content/uploads/2019/10/personnage-harry-potter.jpg"),
            new User("025", "Leopold", "https://static.wikia.nocookie.net/lemondededisney/images/4/49/Timon-%28The_Lion_King%29.jpg/revision/latest?cb=20200401093623&path-prefix=fr")
    );
}
