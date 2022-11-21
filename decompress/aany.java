import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import app.revanced.integrations.patches.VideoSpeedPatch;
import java.text.DecimalFormat;
import app.revanced.integrations.patches.CustomPlaybackSpeed;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aany
{
    private static final apma[] a;
    private final boolean b;
    private final apma[] c;
    private final float d;
    
    static {
        a = new apma[0];
    }
    
    public aany(final boolean b, final PlayerResponseModel playerResponseModel, final float d) {
        this.b = b;
        this.c = d(playerResponseModel);
        this.d = d;
    }
    
    public static apma[] d(final PlayerResponseModel playerResponseModel) {
        apma[] a;
        if (playerResponseModel == null) {
            a = aany.a;
        }
        else {
            final PlayerConfigModel m = playerResponseModel.m();
            apmb apmb;
            if ((apmb = m.c.s) == null) {
                apmb = apmb.a;
            }
            int size = apmb.b.size();
            int customPlaybackSpeedEnabled = CustomPlaybackSpeed.isCustomPlaybackSpeedEnabled() ? 1 : 0;
            if (customPlaybackSpeedEnabled != 0) {
                size = 0;
            }
            int i = 0;
            if (size != 0) {
                apmb apmb2;
                if ((apmb2 = m.c.s) == null) {
                    apmb2 = apmb.a;
                }
                a = ((List)apmb2.b).toArray(new apma[0]);
            }
            else {
                final DecimalFormat decimalFormat = new DecimalFormat("0.0#");
                int length = 7;
                if (customPlaybackSpeedEnabled != 0) {
                    length = VideoSpeedPatch.videoSpeeds.length;
                }
                final apma[] array = new apma[length];
                while (i < length) {
                    final ahcr builder = ((ahcz)apma.a).createBuilder();
                    float[] array2 = PlayerConfigModel.a;
                    if (customPlaybackSpeedEnabled != 0) {
                        array2 = VideoSpeedPatch.videoSpeeds;
                    }
                    final float d = array2[i];
                    final ahct ahct = (ahct)((ahcz)ajws.a).createBuilder();
                    final ahct ahct2 = (ahct)((ahcz)ajwu.a).createBuilder();
                    final String format = decimalFormat.format(d);
                    ((ahcr)ahct2).copyOnWrite();
                    final ajwu ajwu = (ajwu)ahct2.instance;
                    format.getClass();
                    customPlaybackSpeedEnabled = (ajwu.b | 0x1);
                    ajwu.b = customPlaybackSpeedEnabled;
                    ajwu.c = format;
                    ahct.i((ajwu)((ahcr)ahct2).build());
                    builder.copyOnWrite();
                    final apma apma = (apma)builder.instance;
                    final ajws c = (ajws)((ahcr)ahct).build();
                    c.getClass();
                    apma.c = c;
                    apma.b |= 0x1;
                    builder.copyOnWrite();
                    final apma apma2 = (apma)builder.instance;
                    apma2.b |= 0x2;
                    apma2.d = d;
                    array[i] = (apma)builder.build();
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
        for (final apma apma : this.c) {
            if (apma.d == this.d) {
                ajws ajws;
                if ((ajws = apma.c) == null) {
                    ajws = ajws.a;
                }
                return ((ajwu)ajws.c.get(0)).c;
            }
        }
        return null;
    }
    
    public apma[] c() {
        return this.c;
    }
}
