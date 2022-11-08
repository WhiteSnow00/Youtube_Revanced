import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankr extends agzi implements ahax
{
    public static final ankr a;
    public static final agzg b;
    private static volatile ahbe e;
    public String c;
    public agzy d;
    private int f;
    
    static {
        final ankr a2 = new ankr();
        agzi.registerDefaultInstance(ankr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 477657426, ahcm.k, ankr.class);
    }
    
    private ankr() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ankr.e) == null) {
                    synchronized (ankr.class) {
                        if (ankr.e == null) {
                            ankr.e = (ahbe)new agzb((agzi)ankr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ankr.a;
            }
            case 4: {
                return new agza((agzi)ankr.a);
            }
            case 3: {
                return new ankr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "f", "c", "d" });
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
