import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class obu implements asgb
{
    private static final afik a;
    private final obx b;
    
    static {
        a = afik.m("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver");
    }
    
    public obu(final obx b) {
        this.b = b;
    }
    
    public final void a() {
        ((afii)((afii)((afig)obu.a).d()).j("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver", "onCompleted", 48, "BroadcastStateUpdateResponseObserver.java")).t("onCompleted called - thread %s", (Object)nzj.l());
        this.b.a(Optional.empty());
    }
    
    public final void b(final Throwable t) {
        ((afii)((afii)((afii)((afig)obu.a).h()).i(t)).j("com/google/android/libraries/communications/sdk/sync/ipc/BroadcastStateUpdateResponseObserver", "onError", 36, "BroadcastStateUpdateResponseObserver.java")).t("onError called - thread %s", (Object)nzj.l());
        this.b.a(Optional.of((Object)t));
    }
}
