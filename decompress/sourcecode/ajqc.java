import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqc extends agzi implements ahax
{
    public static final ajqc a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public boolean d;
    
    static {
        final ajqc a2 = new ajqc();
        agzi.registerDefaultInstance((Class)ajqc.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajqg.a, (Object)a2, (MessageLite)a2, (agzn)null, 188907957, ahcm.k, (Class)ajqc.class);
    }
    
    private ajqc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajqc.e) == null) {
                    synchronized (ajqc.class) {
                        if (ajqc.e == null) {
                            ajqc.e = (ahbe)new agzb((agzi)ajqc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajqc.a;
            }
            case 4: {
                return new agza((agzi)ajqc.a);
            }
            case 3: {
                return new ajqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
