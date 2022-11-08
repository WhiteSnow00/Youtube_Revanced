import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbw
{
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    private afcw E;
    public int a;
    public float b;
    public boolean c;
    public boolean d;
    public float e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public float r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public float x;
    public boolean y;
    public boolean z;
    
    public final acca a() {
        if (this.D == 268435455 && this.E != null && this.f != null) {
            return (acca)new acbm(this.E, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.E == null) {
            sb.append(" surfaceConfigMap");
        }
        if ((this.D & 0x1) == 0x0) {
            sb.append(" ekoReleaseChannel");
        }
        if ((this.D & 0x2) == 0x0) {
            sb.append(" lithoPoolMultiplier");
        }
        if ((this.D & 0x4) == 0x0) {
            sb.append(" lithoPoolOnRB");
        }
        if ((this.D & 0x8) == 0x0) {
            sb.append(" enableElementsPerformanceMetric");
        }
        if ((this.D & 0x10) == 0x0) {
            sb.append(" elementsPerformanceMetricSampleRate");
        }
        if (this.f == null) {
            sb.append(" elementsPerformanceMetricSubSampleRate");
        }
        if ((this.D & 0x20) == 0x0) {
            sb.append(" elementsPerformanceMetricPipeline");
        }
        if ((this.D & 0x40) == 0x0) {
            sb.append(" ekoProcessorMaxLruCacheSize");
        }
        if ((this.D & 0x80) == 0x0) {
            sb.append(" defaultProperties");
        }
        if ((this.D & 0x100) == 0x0) {
            sb.append(" thumbnailResolutionType");
        }
        if ((this.D & 0x200) == 0x0) {
            sb.append(" useStateUpdateReconciliation");
        }
        if ((this.D & 0x400) == 0x0) {
            sb.append(" lithoLayoutCanMoveBetweenThreads");
        }
        if ((this.D & 0x800) == 0x0) {
            sb.append(" androidUseClipBounds");
        }
        if ((this.D & 0x1000) == 0x0) {
            sb.append(" lithoPoolMaxSize");
        }
        if ((this.D & 0x2000) == 0x0) {
            sb.append(" useGlobalLegacyVisible");
        }
        if ((this.D & 0x4000) == 0x0) {
            sb.append(" reportMissingImageSources");
        }
        if ((this.D & 0x8000) == 0x0) {
            sb.append(" sectionsConfigurationUseBackgroundChangeSets");
        }
        if ((this.D & 0x10000) == 0x0) {
            sb.append(" collectionRangeRatio");
        }
        if ((this.D & 0x20000) == 0x0) {
            sb.append(" useExecutorLithoHandler");
        }
        if ((this.D & 0x40000) == 0x0) {
            sb.append(" useCompositeDisposableForCommands");
        }
        if ((this.D & 0x80000) == 0x0) {
            sb.append(" materializationBloatMs");
        }
        if ((this.D & 0x100000) == 0x0) {
            sb.append(" disableNotifyDataSetChangedOnOrientationChange");
        }
        if ((this.D & 0x200000) == 0x0) {
            sb.append(" enableElementsPbToFbMetric");
        }
        if ((this.D & 0x400000) == 0x0) {
            sb.append(" imagePrefetchRangeRatio");
        }
        if ((this.D & 0x800000) == 0x0) {
            sb.append(" enableHorizontalSwipeProtectorForShorts");
        }
        if ((this.D & 0x1000000) == 0x0) {
            sb.append(" enableHorizontalFadedScrim");
        }
        if ((this.D & 0x2000000) == 0x0) {
            sb.append(" enableVerticalFadedScrim");
        }
        if ((this.D & 0x4000000) == 0x0) {
            sb.append(" useNoScheduledPerfFlush");
        }
        if ((this.D & 0x8000000) == 0x0) {
            sb.append(" elementPresenterRetainsLithoState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final Map map) {
        this.E = afcw.k(map);
    }
}
