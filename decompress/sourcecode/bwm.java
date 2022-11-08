import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwm
{
    static final String[] a;
    
    static {
        a = new String[] { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient" };
    }
    
    public static int a(final bar bar) {
        bar.H(4);
        if (bar.d() == 1684108385) {
            bar.H(8);
            return bar.i();
        }
        bao.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
    
    public static Id3Frame b(final int n, final String s, final bar bar, final boolean b, final boolean b2) {
        int n3;
        final int n2 = n3 = a(bar);
        if (b2) {
            n3 = Math.min(1, n2);
        }
        if (n3 >= 0) {
            Object o;
            if (b) {
                o = new TextInformationFrame(s, (String)null, Integer.toString(n3));
            }
            else {
                o = new CommentFrame("und", s, Integer.toString(n3));
            }
            return (Id3Frame)o;
        }
        bao.c("MetadataUtil", "Failed to parse uint8 attribute: ".concat(bwa.g(n)));
        return null;
    }
    
    public static TextInformationFrame c(int m, final String s, final bar bar) {
        final int d = bar.d();
        if (bar.d() == 1684108385 && d >= 22) {
            bar.H(10);
            final int i = bar.m();
            if (i > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(i);
                final String string = sb.toString();
                m = bar.m();
                String string2 = string;
                if (m > 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(m);
                    string2 = sb2.toString();
                }
                return new TextInformationFrame(s, (String)null, string2);
            }
        }
        bao.c("MetadataUtil", "Failed to parse index/count attribute: ".concat(bwa.g(m)));
        return null;
    }
    
    public static TextInformationFrame d(final int n, final String s, final bar bar) {
        final int d = bar.d();
        if (bar.d() == 1684108385) {
            bar.H(8);
            return new TextInformationFrame(s, (String)null, bar.v(d - 16));
        }
        bao.c("MetadataUtil", "Failed to parse text attribute: ".concat(bwa.g(n)));
        return null;
    }
}
