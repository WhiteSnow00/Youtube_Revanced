import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfz extends agzi implements ahax
{
    public static final amfz a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final amfz a2 = new amfz();
        agzi.registerDefaultInstance((Class)amfz.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 247401431, ahcm.k, (Class)amfz.class);
    }
    
    private amfz() {
        this.c = 0;
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = amfz.e) == null) {
                    synchronized (amfz.class) {
                        if (amfz.e == null) {
                            amfz.e = (ahbe)new agzb((agzi)amfz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amfz.a;
            }
            case 4: {
                return new agza((agzi)amfz.a);
            }
            case 3: {
                return new amfz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfz.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u143c\u0000", new Object[] { "d", "c", aksf.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
