import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.FileInputStream;
import com.google.android.libraries.elements.interfaces.JSModuleBytesProvider;
import com.google.android.libraries.elements.interfaces.CertificateTracker;
import com.google.android.libraries.elements.interfaces.ResourceMetadataTracker;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.CacheStrategyDelegate;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;
import com.google.android.libraries.elements.interfaces.ResourceLoaderConfig;
import com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy;
import java.io.File;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.libraries.elements.interfaces.ResponseHydration;
import com.google.android.libraries.elements.interfaces.ResourceLoader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acax implements ots
{
    private final otd a;
    private volatile ResourceLoader b;
    private volatile ResponseHydration c;
    private final arhr d;
    private final ansv e;
    private final boolean f;
    private final afqr g;
    private final boolean h;
    private final AtomicBoolean i;
    private volatile boolean j;
    private final Context k;
    private final ResourceLoaderDelegate l;
    private final arhr m;
    
    public acax(final otd a, final arud arud, final uyf uyf, final arhr d, final Context k, final ResourceLoaderDelegate l, final arhr m, final aexq aexq, final afqr g, final byte[] array, final byte[] array2) {
        this.i = new AtomicBoolean(false);
        this.j = false;
        this.a = a;
        this.d = d;
        answ answ;
        if ((answ = uyf.b().j) == null) {
            answ = answ.a;
        }
        ansv e;
        if ((e = answ.k) == null) {
            e = ansv.a;
        }
        this.e = e;
        this.k = k;
        boolean h = false;
        Label_0117: {
            if (e.d) {
                ansy ansy;
                if ((ansy = arud.f().k) == null) {
                    ansy = ansy.a;
                }
                if (!ansy.c) {
                    h = true;
                    break Label_0117;
                }
            }
            h = false;
        }
        this.h = h;
        this.l = l;
        this.m = m;
        this.f = (boolean)aexq.e(false);
        this.g = g;
    }
    
    @Override
    public final ResourceLoader a() {
        final ResourceLoader b;
        if ((b = this.b) == null) {
            synchronized (this) {
                if (this.b == null) {
                    final JSEnvironment jsEnvironment = (JSEnvironment)this.d.a();
                    final JSController controller = jsEnvironment.getController();
                    if (controller == null) {
                        throw new otf("JSController is null");
                    }
                    final ControllerModuleLoader moduleLoader = jsEnvironment.getModuleLoader();
                    if (moduleLoader == null) {
                        throw new otf("JS Module Loader is null");
                    }
                    final aexq aexq = (aexq)this.m.a();
                    if (!aexq.h()) {
                        throw new otf("Blocks Container Loader is null");
                    }
                    final ansv e = this.e;
                    final int b2 = e.b;
                    int c;
                    if ((b2 & 0x1) != 0x0) {
                        c = e.c;
                    }
                    else {
                        c = 125;
                    }
                    int e2;
                    if ((b2 & 0x8) != 0x0) {
                        e2 = e.e;
                    }
                    else {
                        e2 = 5;
                    }
                    long f;
                    if ((b2 & 0x20) != 0x0) {
                        f = e.f;
                    }
                    else {
                        f = 3145728L;
                    }
                    long g;
                    if ((b2 & 0x80) != 0x0) {
                        g = e.g;
                    }
                    else {
                        g = 21600L;
                    }
                    Object o;
                    if (this.f) {
                        o = new acap();
                    }
                    else {
                        o = new abzx();
                    }
                    ResourceLoader withDefaultConfigWithBlocks = null;
                    Label_0469: {
                        if (this.h) {
                            final String absolutePath = this.k.getFilesDir().getAbsolutePath();
                            final String separator = File.separator;
                            final StringBuilder sb = new StringBuilder();
                            sb.append(absolutePath);
                            sb.append(separator);
                            sb.append("ElementsResourceCacheBytes");
                            final String string = sb.toString();
                            final String absolutePath2 = this.k.getFilesDir().getAbsolutePath();
                            final String separator2 = File.separator;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(absolutePath2);
                            sb2.append(separator2);
                            sb2.append("ElementsResourceCacheMetadata");
                            final StatusOr withCache = ResourceLoader.createWithCache(moduleLoader, (BlocksContainerLoaderProxy)aexq.c(), (PublicKeyVerifierProvider)o, this.l, (CacheStrategyDelegate)new acba(this.a), new ResourceLoaderConfig(Integer.valueOf(c), Integer.valueOf(e2), string, sb2.toString(), Long.valueOf(f), Long.valueOf(g), Boolean.valueOf(true)));
                            if (withCache.hasValue) {
                                withDefaultConfigWithBlocks = (ResourceLoader)withCache.value;
                                if (withDefaultConfigWithBlocks != null && this.j) {
                                    withDefaultConfigWithBlocks.commitCachedTrackableResources();
                                }
                                this.i.set(true);
                                break Label_0469;
                            }
                            this.a.b(32, "ELMCache: SRS persistence is turned on but fails to initialize with error: ".concat(String.valueOf(withCache.status.getDescription())));
                        }
                        withDefaultConfigWithBlocks = null;
                    }
                    if (!this.i.get()) {
                        final StatusOr create = ResourceLoader.create(moduleLoader, (BlocksContainerLoaderProxy)aexq.c(), (PublicKeyVerifierProvider)o, this.l, new ResourceLoaderConfig(Integer.valueOf(c), Integer.valueOf(e2), (String)null, (String)null, (Long)null, (Long)null, Boolean.valueOf(true)));
                        if (create.hasValue) {
                            withDefaultConfigWithBlocks = (ResourceLoader)create.value;
                        }
                        else {
                            final otd a = this.a;
                            final String description = create.status.getDescription();
                            final StringBuilder sb3 = new StringBuilder("Failed to setup resource loader with error: ");
                            sb3.append(description);
                            sb3.append(". Will fall back to default configuration.");
                            a.b(32, sb3.toString());
                            withDefaultConfigWithBlocks = ResourceLoader.createWithDefaultConfigWithBlocks(moduleLoader, (BlocksContainerLoaderProxy)aexq.c(), (PublicKeyVerifierProvider)o, this.l);
                        }
                    }
                    if (withDefaultConfigWithBlocks != null) {
                        final ResourcePreloader preloader = withDefaultConfigWithBlocks.getPreloader();
                        if (preloader != null) {
                            controller.setPreloader(preloader);
                        }
                    }
                    withDefaultConfigWithBlocks.getClass();
                    this.b = withDefaultConfigWithBlocks;
                }
            }
        }
        return b;
    }
    
    @Override
    public final ResponseHydration b() {
        final ResponseHydration c;
        if ((c = this.c) == null) {
            synchronized (this) {
                if (this.c == null) {
                    final ResourceMetadataTracker metadataTracker = this.a().getMetadataTracker();
                    if (metadataTracker == null) {
                        throw new otf("metadataTracker is null");
                    }
                    final CertificateTracker certificateTracker = this.a().getCertificateTracker();
                    if (certificateTracker == null) {
                        throw new otf("certificateTracker is null");
                    }
                    final JSModuleBytesProvider bytesProvider = ((JSEnvironment)this.d.a()).getBytesProvider();
                    if (bytesProvider == null) {
                        throw new otf("bytesProvider is null");
                    }
                    final ResponseHydration create = ResponseHydration.create(metadataTracker, certificateTracker, bytesProvider);
                    create.getClass();
                    this.c = create;
                }
            }
        }
        return c;
    }
    
    @Override
    public final void c() {
        if (!this.h) {
            return;
        }
        monitorenter(this);
        try {
            if (this.b != null) {
                this.b.commitCachedTrackableResources();
                monitorexit(this);
                return;
            }
            this.j = true;
            monitorexit(this);
            final File file = new File(this.k.getFilesDir().getAbsolutePath(), "ElementsResourceCacheMetadata");
            if (!file.exists()) {
                return;
            }
            try {
                final aqem aqem = (aqem)agzi.parseFrom((agzi)aqem.a, (InputStream)new FileInputStream(file), ExtensionRegistryLite.getGeneratedRegistry());
                if (!aqem.c) {
                    if (!aqem.e) {
                        if ((aqem.b & 0x4) != 0x0) {
                            ahca ahca;
                            if ((ahca = aqem.f) == null) {
                                ahca = ahca.a;
                            }
                            if (aeda.an(ahca).isAfter(this.g.a())) {
                                return;
                            }
                        }
                        final ArrayList<Long> list = new ArrayList<Long>();
                        for (final aqel aqel : aqem.d) {
                            if ((aqel.b & 0x4) != 0x0) {
                                list.add(aqel.c);
                            }
                        }
                        synchronized (this) {
                            if (this.b == null) {
                                final ResourceLoaderDelegate l = this.l;
                                final agza builder = ((agzi)aqmm.a).createBuilder();
                                builder.copyOnWrite();
                                final aqmm aqmm = (aqmm)builder.instance;
                                final agzt b = aqmm.b;
                                if (!b.c()) {
                                    aqmm.b = agzi.mutableCopy(b);
                                }
                                agxl.addAll((Iterable)list, (List)aqmm.b);
                                l.onServingContextUpdated(((agxl)builder.build()).toByteArray());
                            }
                        }
                    }
                }
            }
            catch (final IOException ex) {
                this.a.b(32, "Failed to read persisted serving context with error: ".concat(String.valueOf(ex.getMessage())));
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean d() {
        return this.h;
    }
    
    @Override
    public final boolean e() {
        return this.i.get();
    }
}
