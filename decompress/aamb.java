import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import app.revanced.integrations.patches.VideoSpeedPatch;
import java.text.DecimalFormat;
import app.revanced.integrations.patches.CustomPlaybackSpeed;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aamb
{
    private static final apjo[] a;
    private final boolean b;
    private final apjo[] c;
    private final float d;
    
    static {
        a = new apjo[0];
    }
    
    public aamb(final boolean b, final PlayerResponseModel playerResponseModel, final float d) {
        this.b = b;
        this.c = d(playerResponseModel);
        this.d = d;
    }
    
    public static apjo[] d(final PlayerResponseModel playerResponseModel) {
        apjo[] a;
        if (playerResponseModel == null) {
            a = aamb.a;
        }
        else {
            final PlayerConfigModel m = playerResponseModel.m();
            apjp apjp;
            if ((apjp = m.c.s) == null) {
                apjp = apjp.a;
            }
            int size = apjp.b.size();
            int customPlaybackSpeedEnabled = CustomPlaybackSpeed.isCustomPlaybackSpeedEnabled() ? 1 : 0;
            if (customPlaybackSpeedEnabled != 0) {
                size = 0;
            }
            int i = 0;
            if (size != 0) {
                apjp apjp2;
                if ((apjp2 = m.c.s) == null) {
                    apjp2 = apjp.a;
                }
                a = ((List)apjp2.b).toArray(new apjo[0]);
            }
            else {
                final DecimalFormat decimalFormat = new DecimalFormat("0.0#");
                int length = 7;
                if (customPlaybackSpeedEnabled != 0) {
                    length = VideoSpeedPatch.videoSpeeds.length;
                }
                final apjo[] array = new apjo[length];
                while (i < length) {
                    final ahaz builder = ((ahbh)apjo.a).createBuilder();
                    float[] array2 = PlayerConfigModel.a;
                    if (customPlaybackSpeedEnabled != 0) {
                        array2 = VideoSpeedPatch.videoSpeeds;
                    }
                    final float d = array2[i];
                    final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
                    final ahbb ahbb2 = (ahbb)((ahbh)ajuv.a).createBuilder();
                    final String format = decimalFormat.format(d);
                    ((ahaz)ahbb2).copyOnWrite();
                    final ajuv ajuv = (ajuv)ahbb2.instance;
                    format.getClass();
                    customPlaybackSpeedEnabled = (ajuv.b | 0x1);
                    ajuv.b = customPlaybackSpeedEnabled;
                    ajuv.c = format;
                    ahbb.i((ajuv)((ahaz)ahbb2).build());
                    builder.copyOnWrite();
                    final apjo apjo = (apjo)builder.instance;
                    final ajut c = (ajut)((ahaz)ahbb).build();
                    c.getClass();
                    apjo.c = c;
                    apjo.b |= 0x1;
                    builder.copyOnWrite();
                    final apjo apjo2 = (apjo)builder.instance;
                    apjo2.b |= 0x2;
                    apjo2.d = d;
                    array[i] = (apjo)builder.build();
                    ++i;
                }
                a = array;
            }
        }
        return a;
    }
    
    public float a() {
        return this.d;
    }
    
    public String b() {
        for (final apjo apjo : this.c) {
            if (apjo.d == this.d) {
                ajut ajut;
                if ((ajut = apjo.c) == null) {
                    ajut = ajut.a;
                }
                return ((ajuv)ajut.c.get(0)).c;
            }
        }
        return null;
    }
    
    public apjo[] c() {
        return this.c;
    }
}
