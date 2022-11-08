import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jgv implements acol
{
    public final Activity F;
    public final LoadingFrameLayout G;
    public final wwv H;
    public aioe I;
    public akww J;
    public aofi K;
    protected akxg L;
    protected String M;
    public Bundle N;
    public String O;
    public jgt P;
    public amob Q;
    public final uyf R;
    public final arud S;
    
    public jgv(final LoadingFrameLayout g, final Activity f, final wwv h, final uyf r, final arud s, final Bundle bundle, final acpi acpi, final byte[] array, final byte[] array2) {
        this.G = g;
        this.F = f;
        this.H = h;
        this.R = r;
        this.S = s;
        this.J = null;
        this.s(bundle, acpi);
    }
    
    public abstract void a();
    
    public abstract void c(final String p0, final String p1);
    
    public abstract void d(final Configuration p0);
    
    public abstract void e(final String p0);
    
    public abstract void f(final String p0, final acvr p1);
    
    public abstract boolean g();
    
    public abstract boolean h();
    
    public void m(final Bundle bundle) {
        final aofi k = this.K;
        if (k != null) {
            bundle.putParcelable("innertube_search_filters", (Parcelable)aeda.as((MessageLite)k));
        }
        final akxg l = this.L;
        if (l != null) {
            bundle.putByteArray("searchbox_stats", ((agxl)l).toByteArray());
        }
        final aioe i = this.I;
        if (i != null) {
            bundle.putByteArray("navigation_endpoint", ((agxl)i).toByteArray());
        }
        bundle.putString("clone_csn", this.H.i());
    }
    
    @Override
    public acpi qv() {
        return new jgu(this.J, this.N);
    }
    
    public final List r() {
        final ArrayList list = new ArrayList();
        for (final aofg aofg : this.K.b) {
            int n;
            for (int i = 0; i < aofg.c.size(); i = n + 1) {
                final aofh aofh = (aofh)aofg.c.get(i);
                final int bp = aqql.bp(aofh.d);
                if (bp == 0) {
                    n = i;
                }
                else {
                    n = i;
                    if (bp == 3) {
                        if (!aofg.d && i == 0) {
                            n = 0;
                        }
                        else {
                            list.add(aofh.e);
                            n = i;
                        }
                    }
                }
            }
        }
        return list;
    }
    
    public final void s(final Bundle bundle, final acpi acpi) {
        if (bundle != null) {
            final byte[] byteArray = bundle.getByteArray("navigation_endpoint");
            final byte[] byteArray2 = bundle.getByteArray("searchbox_stats");
            aioe c;
            if (byteArray != null) {
                c = vba.c(byteArray);
            }
            else {
                c = null;
            }
            this.I = c;
            akxg l = null;
            Label_0075: {
                if (byteArray2 != null) {
                    try {
                        l = (akxg)agzi.parseFrom((agzi)akxg.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                        break Label_0075;
                    }
                    catch (final ahab ahab) {
                        trn.d("InvalidProtocolBufferException: ", (Throwable)ahab);
                    }
                }
                l = null;
            }
            this.L = l;
            this.M = bundle.getString("thumbnail_video_id");
            try {
                if (bundle.containsKey("innertube_search_filters")) {
                    this.K = (aofi)aeda.aq(bundle, "innertube_search_filters", (MessageLite)aofi.a, ExtensionRegistryLite.getGeneratedRegistry());
                }
            }
            catch (final ahab ahab2) {
                this.K = null;
            }
            final byte[] byteArray3 = bundle.getByteArray("navigation_endpoint_interaction_logging_extension");
            if (byteArray3 != null) {
                final agza builder = ((agzi)amob.a).createBuilder();
                try {
                    this.Q = (amob)((agza)((agxk)builder).mergeFrom(byteArray3, ExtensionRegistryLite.getGeneratedRegistry())).build();
                }
                catch (final ahab ahab3) {}
            }
            final amob q = this.Q;
            if (q != null) {
                final agza builder2 = ((agzi)q).toBuilder();
                builder2.copyOnWrite();
                final amob amob = (amob)builder2.instance;
                amob.b |= 0x2;
                amob.d = 22156;
                final String string = bundle.getString("clone_csn");
                if (string != null) {
                    builder2.copyOnWrite();
                    final amob amob2 = (amob)builder2.instance;
                    amob2.b |= 0x20;
                    amob2.f = string;
                }
                else {
                    builder2.copyOnWrite();
                    final amob amob3 = (amob)builder2.instance;
                    amob3.b &= 0xFFFFFFDF;
                    amob3.f = amob.a.f;
                }
                this.Q = (amob)builder2.build();
            }
            if (bundle.getBundle("instance_controller_state") != null) {
                this.N = bundle.getBundle("instance_controller_state");
            }
        }
        if (!(acpi instanceof jgu)) {
            return;
        }
        final jgu jgu = (jgu)acpi;
        this.J = jgu.a;
        this.N = jgu.b;
    }
}
