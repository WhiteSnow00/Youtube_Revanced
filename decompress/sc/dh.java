import android.os.Bundle;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import android.os.Build$VERSION;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class dh extends Activity implements aun, ali
{
    private abo mExtraDataMap;
    private auo mLifecycleRegistry;
    
    public dh() {
        this.mExtraDataMap = new abo();
        this.mLifecycleRegistry = new auo((aun)this);
    }
    
    private static boolean shouldSkipDump(final String[] array) {
        if (array != null && array.length > 0) {
            final String s = array[0];
            int n = 0;
            Label_0143: {
                switch (s.hashCode()) {
                    case 1455016274: {
                        if (s.equals("--autofill")) {
                            n = 0;
                            break Label_0143;
                        }
                        break;
                    }
                    case 1159329357: {
                        if (s.equals("--contentcapture")) {
                            n = 1;
                            break Label_0143;
                        }
                        break;
                    }
                    case 472614934: {
                        if (s.equals("--list-dumpables")) {
                            n = 3;
                            break Label_0143;
                        }
                        break;
                    }
                    case 100470631: {
                        if (s.equals("--dump-dumpable")) {
                            n = 4;
                            break Label_0143;
                        }
                        break;
                    }
                    case -645125871: {
                        if (s.equals("--translation")) {
                            n = 2;
                            break Label_0143;
                        }
                        break;
                    }
                }
                n = -1;
            }
            if (n == 0) {
                return true;
            }
            if (n == 1) {
                return Build$VERSION.SDK_INT >= 29;
            }
            if (n == 2) {
                return Build$VERSION.SDK_INT >= 31;
            }
            if (n == 3 || n == 4) {
                return aeo.g();
            }
        }
        return false;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && anb.ah(decorView, keyEvent)) || alj.a((ali)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && anb.ah(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    @Deprecated
    public dg getExtraData(final Class clazz) {
        return (dg)this.mExtraDataMap.get((Object)clazz);
    }
    
    public aui getLifecycle() {
        return (aui)this.mLifecycleRegistry;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        avf.b((Activity)this);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        final auo mLifecycleRegistry = this.mLifecycleRegistry;
        final auh c = auh.c;
        auo.g("markState");
        mLifecycleRegistry.f(c);
        super.onSaveInstanceState(bundle);
    }
    
    @Deprecated
    public void putExtraData(final dg dg) {
        this.mExtraDataMap.put((Object)dg.getClass(), (Object)dg);
    }
    
    protected boolean shouldDumpInternalState(final String[] array) {
        return !shouldSkipDump(array);
    }
    
    public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
