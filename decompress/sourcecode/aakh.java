import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import app.revanced.integrations.patches.VideoSpeedPatch;
import java.text.DecimalFormat;
import app.revanced.integrations.patches.CustomPlaybackSpeed;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public class aakh
{
    private static final aphk[] a;
    private final boolean b;
    private final aphk[] c;
    private final float d;
    
    static {
        a = new aphk[0];
    }
    
    public aakh(final boolean b, final PlayerResponseModel playerResponseModel, final float d) {
        this.b = b;
        this.c = d(playerResponseModel);
        this.d = d;
    }
    
    public static aphk[] d(final PlayerResponseModel playerResponseModel) {
        aphk[] a;
        if (playerResponseModel == null) {
            a = aakh.a;
        }
        else {
            final PlayerConfigModel m = playerResponseModel.m();
            aphl aphl;
            if ((aphl = m.c.s) == null) {
                aphl = aphl.a;
            }
            int size = aphl.b.size();
            int customPlaybackSpeedEnabled = CustomPlaybackSpeed.isCustomPlaybackSpeedEnabled() ? 1 : 0;
            if (customPlaybackSpeedEnabled != 0) {
                size = 0;
            }
            int i = 0;
            if (size != 0) {
                aphl aphl2;
                if ((aphl2 = m.c.s) == null) {
                    aphl2 = aphl.a;
                }
                a = aphl2.b.toArray(new aphk[0]);
            }
            else {
                final DecimalFormat decimalFormat = new DecimalFormat("0.0#");
                int length = 7;
                if (customPlaybackSpeedEnabled != 0) {
                    length = VideoSpeedPatch.videoSpeeds.length;
                }
                final aphk[] array = new aphk[length];
                while (i < length) {
                    final agza builder = ((agzi)aphk.a).createBuilder();
                    float[] array2 = PlayerConfigModel.a;
                    if (customPlaybackSpeedEnabled != 0) {
                        array2 = VideoSpeedPatch.videoSpeeds;
                    }
                    final float d = array2[i];
                    final agzc agzc = (agzc)((agzi)ajsq.a).createBuilder();
                    final agzc agzc2 = (agzc)((agzi)ajss.a).createBuilder();
                    final String format = decimalFormat.format(d);
                    agzc2.copyOnWrite();
                    final ajss ajss = (ajss)agzc2.instance;
                    format.getClass();
                    customPlaybackSpeedEnabled = (ajss.b | 0x1);
                    ajss.b = customPlaybackSpeedEnabled;
                    ajss.c = format;
                    agzc.i((ajss)agzc2.build());
                    builder.copyOnWrite();
                    final aphk aphk = (aphk)builder.instance;
                    final ajsq c = (ajsq)agzc.build();
                    c.getClass();
                    aphk.c = c;
                    aphk.b |= 0x1;
                    builder.copyOnWrite();
                    final aphk aphk2 = (aphk)builder.instance;
                    aphk2.b |= 0x2;
                    aphk2.d = d;
                    array[i] = (aphk)builder.build();
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
        for (final aphk aphk : this.c) {
            if (aphk.d == this.d) {
                ajsq ajsq;
                if ((ajsq = aphk.c) == null) {
                    ajsq = ajsq.a;
                }
                return ((ajss)ajsq.c.get(0)).c;
            }
        }
        return null;
    }
    
    public aphk[] c() {
        return this.c;
    }
}
