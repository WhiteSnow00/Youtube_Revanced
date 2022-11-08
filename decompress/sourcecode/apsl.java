import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsl extends agzi implements ahax
{
    public static final apsl a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance((Class)apsl.class, (agzi)(a = new apsl()));
    }
    
    private apsl() {
        this.c = 0;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apsl.f) == null) {
                    synchronized (apsl.class) {
                        if (apsl.f == null) {
                            apsl.f = (ahbe)new agzb((agzi)apsl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsl.a;
            }
            case 4: {
                return new agza((agzi)apsl.a);
            }
            case 3: {
                return new apsl();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsl.a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000", new Object[] { "d", "c", "b", "e", apso.class, apsk.class, aptc.class, apsx.class, apsr.class, apsw.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
