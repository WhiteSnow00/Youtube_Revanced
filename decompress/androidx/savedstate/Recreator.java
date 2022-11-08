// 
// Decompiled by Procyon v0.6.0
// 

package androidx.savedstate;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;

public final class Recreator implements auk
{
    private final cgj a;
    
    public Recreator(final cgj a) {
        this.a = a;
    }
    
    @Override
    public final void a(aum ex, final auf auf) {
        if (auf != auf.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        ((aum)ex).getLifecycle().c((aul)this);
        final Bundle a = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                ex = (NoSuchMethodException)iterator.next();
                try {
                    Object o = Class.forName((String)ex, false, Recreator.class.getClassLoader()).asSubclass(cgf.class);
                    ((Class)o).getClass();
                    try {
                        final Constructor declaredConstructor = ((Class)o).getDeclaredConstructor((Class[])new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            o = declaredConstructor.newInstance(new Object[0]);
                            ((Class)o).getClass();
                            o = o;
                            ((cgf)o).a(this.a);
                        }
                        catch (final Exception ex2) {
                            throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(ex)), ex2);
                        }
                    }
                    catch (final NoSuchMethodException ex) {
                        final StringBuilder sb = new StringBuilder("Class ");
                        sb.append(((Class)o).getSimpleName());
                        sb.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(sb.toString(), ex);
                    }
                }
                catch (final ClassNotFoundException ex3) {
                    final StringBuilder sb2 = new StringBuilder("Class ");
                    sb2.append((String)ex);
                    sb2.append(" wasn't found");
                    throw new RuntimeException(sb2.toString(), ex3);
                }
                break;
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}
