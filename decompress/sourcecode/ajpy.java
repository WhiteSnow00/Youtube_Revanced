import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpy extends agzi implements ahax
{
    public static final ajpy a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    
    static {
        final ajpy a2 = new ajpy();
        agzi.registerDefaultInstance((Class)ajpy.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 349, ahcm.k, (Class)ajpy.class);
    }
    
    private ajpy() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ajpy.g) == null) {
                    synchronized (ajpy.class) {
                        if (ajpy.g == null) {
                            ajpy.g = (ahbe)new agzb((agzi)ajpy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajpy.a;
            }
            case 4: {
                return new agza((agzi)ajpy.a);
            }
            case 3: {
                return new ajpy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "c", "d", "e", "f" });
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
