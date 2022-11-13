import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Locale;
import android.os.Environment;
import android.content.SharedPreferences;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjd implements adje
{
    private final File a;
    private boolean b;
    
    public adjd(final SharedPreferences sharedPreferences) {
        this.b = false;
        sharedPreferences.getClass();
        final String string = sharedPreferences.getString("system_health_metric_disk_output_dir", (String)null);
        if (string != null) {
            this.a = new File(Environment.getExternalStorageDirectory(), String.valueOf(File.separator).concat(string));
            return;
        }
        this.a = null;
    }
    
    @Override
    public final void a(final aora aora) {
        final File a = this.a;
        if (a == null) {
            return;
        }
        if (!a.exists()) {
            this.a.mkdirs();
        }
        this.b = true;
    }
    
    @Override
    public final boolean b() {
        return this.b;
    }
    
    @Override
    public final void c(final aoqk aoqk) {
        this.e(aoqk);
    }
    
    @Override
    public final void d(final aoqk aoqk) {
        this.e(aoqk);
    }
    
    final void e(final aoqk aoqk) {
        if (this.b) {
            if (aoqk != null) {
                try {
                    final Locale english = Locale.ENGLISH;
                    final long currentTimeMillis = System.currentTimeMillis();
                    String s = null;
                    Label_0133: {
                        try {
                            final int b = ((atzd)ahbh.parseFrom((ahbh)atzd.a, aoqk.f, ExtensionRegistryLite.getGeneratedRegistry())).b;
                            if ((b & 0x40) != 0x0) {
                                s = "crash";
                                break Label_0133;
                            }
                            if ((b & 0x80) != 0x0) {
                                s = "disk";
                                break Label_0133;
                            }
                            if ((b & 0x8) != 0x0) {
                                s = "memory";
                                break Label_0133;
                            }
                            if ((b & 0x20) != 0x0) {
                                s = "network";
                                break Label_0133;
                            }
                            if ((b & 0x2000000) != 0x0) {
                                s = "stats";
                                break Label_0133;
                            }
                        }
                        catch (final ahca ahca) {
                            ahca.printStackTrace();
                        }
                        s = "unknown";
                    }
                    afpj.c(((agzk)aoqk).toByteArray(), File.createTempFile(String.format(english, "%d-%s-", currentTimeMillis, s), ".capture", this.a));
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
