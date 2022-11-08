import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkf extends agzi implements ahax
{
    public static final ahkf a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public String e;
    
    static {
        final ahkf a2 = new ahkf();
        agzi.registerDefaultInstance((Class)ahkf.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 179, ahcm.k, (Class)ahkf.class);
    }
    
    private ahkf() {
        this.d = "";
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
                if ((f = ahkf.f) == null) {
                    synchronized (ahkf.class) {
                        if (ahkf.f == null) {
                            ahkf.f = (ahbe)new agzb((agzi)ahkf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkf.a;
            }
            case 4: {
                return new agza((agzi)ahkf.a);
            }
            case 3: {
                return new ahkf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
