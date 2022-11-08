import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Locale;
import android.os.Environment;
import android.content.SharedPreferences;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adha implements adhb
{
    private final File a;
    private boolean b;
    
    public adha(final SharedPreferences sharedPreferences) {
        this.b = false;
        sharedPreferences.getClass();
        final String string = sharedPreferences.getString("system_health_metric_disk_output_dir", (String)null);
        if (string != null) {
            this.a = new File(Environment.getExternalStorageDirectory(), String.valueOf(File.separator).concat(string));
            return;
        }
        this.a = null;
    }
    
    public final void a(final aoox aoox) {
        final File a = this.a;
        if (a == null) {
            return;
        }
        if (!a.exists()) {
            this.a.mkdirs();
        }
        this.b = true;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final void c(final aooh aooh) {
        this.e(aooh);
    }
    
    public final void d(final aooh aooh) {
        this.e(aooh);
    }
    
    final void e(final aooh aooh) {
        if (this.b) {
            if (aooh != null) {
                try {
                    final Locale english = Locale.ENGLISH;
                    final long currentTimeMillis = System.currentTimeMillis();
                    String s = null;
                    Label_0138: {
                        try {
                            final int b = ((atyg)agzi.parseFrom(atyg.a, aooh.f, ExtensionRegistryLite.getGeneratedRegistry())).b;
                            if ((b & 0x40) != 0x0) {
                                s = "crash";
                                break Label_0138;
                            }
                            if ((b & 0x80) != 0x0) {
                                s = "disk";
                                break Label_0138;
                            }
                            if ((b & 0x8) != 0x0) {
                                s = "memory";
                                break Label_0138;
                            }
                            if ((b & 0x20) != 0x0) {
                                s = "network";
                                break Label_0138;
                            }
                            if ((b & 0x2000000) != 0x0) {
                                s = "stats";
                                break Label_0138;
                            }
                        }
                        catch (final ahab ahab) {
                            ahab.printStackTrace();
                        }
                        s = "unknown";
                    }
                    afnj.c(((agxl)aooh).toByteArray(), File.createTempFile(String.format(english, "%d-%s-", currentTimeMillis, s), ".capture", this.a));
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
