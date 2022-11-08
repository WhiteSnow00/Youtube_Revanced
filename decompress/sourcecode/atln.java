import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atln implements Serializable, atld, atlq
{
    private final atld completion;
    
    public atln(final atld completion) {
        this.completion = completion;
    }
    
    public atld create(final atld atld) {
        atld.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
    
    public atld create(final Object o, final atld atld) {
        atld.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    @Override
    public atlq getCallerFrame() {
        final atld completion = this.completion;
        if (completion instanceof atlq) {
            return (atlq)completion;
        }
        return null;
    }
    
    public final atld getCompletion() {
        return this.completion;
    }
    
    @Override
    public StackTraceElement getStackTraceElement() {
        final atlr atlr = this.getClass().getAnnotation(atlr.class);
        StackTraceElement stackTraceElement = null;
        final String s = null;
        if (atlr != null) {
            final int a = atlr.a();
            if (a > 1) {
                final StringBuilder sb = new StringBuilder("Debug metadata version mismatch. Expected: 1, got ");
                sb.append(a);
                sb.append(". Please update the Kotlin standard library.");
                throw new IllegalStateException(sb.toString());
            }
            final int n = -1;
            int intValue;
            try {
                final Field declaredField = this.getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                final Object value = declaredField.get(this);
                Integer n2;
                if (value instanceof Integer) {
                    n2 = (Integer)value;
                }
                else {
                    n2 = null;
                }
                if (n2 != null) {
                    intValue = n2;
                }
                else {
                    intValue = 0;
                }
                --intValue;
            }
            catch (final Exception ex) {
                intValue = -1;
            }
            int n3;
            if (intValue < 0) {
                n3 = n;
            }
            else {
                n3 = atlr.e()[intValue];
            }
            auip b;
            if ((b = atls.b) == null) {
                try {
                    b = (atls.b = new auip(Class.class.getDeclaredMethod("getModule", (Class<?>[])new Class[0]), this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class<?>[])new Class[0]), this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class<?>[])new Class[0])));
                }
                catch (final Exception ex2) {
                    b = (atls.b = atls.a);
                }
            }
            String s2;
            if (b == atls.a) {
                s2 = s;
            }
            else {
                final Object c = b.c;
                Object invoke;
                if (c != null) {
                    invoke = ((Method)c).invoke(this.getClass(), new Object[0]);
                }
                else {
                    invoke = null;
                }
                if (invoke == null) {
                    s2 = s;
                }
                else {
                    final Object b2 = b.b;
                    Object invoke2;
                    if (b2 != null) {
                        invoke2 = ((Method)b2).invoke(invoke, new Object[0]);
                    }
                    else {
                        invoke2 = null;
                    }
                    if (invoke2 == null) {
                        s2 = s;
                    }
                    else {
                        final Object a2 = b.a;
                        Object invoke3;
                        if (a2 != null) {
                            invoke3 = ((Method)a2).invoke(invoke2, new Object[0]);
                        }
                        else {
                            invoke3 = null;
                        }
                        s2 = s;
                        if (invoke3 instanceof String) {
                            s2 = (String)invoke3;
                        }
                    }
                }
            }
            String s3;
            if (s2 == null) {
                s3 = atlr.b();
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s2);
                sb2.append('/');
                sb2.append(atlr.b());
                s3 = sb2.toString();
            }
            stackTraceElement = new StackTraceElement(s3, atlr.d(), atlr.c(), n3);
        }
        return stackTraceElement;
    }
    
    protected abstract Object invokeSuspend(final Object p0);
    
    protected void releaseIntercepted() {
    }
    
    @Override
    public final void resumeWith(Object o) {
        atld completion = this;
        do {
            ((atln)completion).getClass();
            final atln atln = (atln)completion;
            completion = atln.completion;
            ((atln)completion).getClass();
            try {
                o = atln.invokeSuspend(o);
                if (o == atlk.a) {
                    return;
                }
            }
            finally {
                final Throwable t;
                o = arxj.g(t);
            }
            atln.releaseIntercepted();
        } while (completion instanceof atln);
        completion.resumeWith(o);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable s = this.getStackTraceElement();
        if (s == null) {
            s = this.getClass().getName();
        }
        sb.append(s);
        return sb.toString();
    }
}
