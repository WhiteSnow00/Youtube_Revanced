import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsz extends agzi implements ahax
{
    public static final agsz a;
    private static volatile ahbe e;
    public int b;
    public agsy c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agsz.class, a = new agsz());
    }
    
    private agsz() {
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
                if ((e = agsz.e) == null) {
                    synchronized (agsz.class) {
                        if (agsz.e == null) {
                            agsz.e = (ahbe)new agzb((agzi)agsz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsz.a;
            }
            case 4: {
                return new agza((agzi)agsz.a);
            }
            case 3: {
                return new agsz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsz.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", afon.t });
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
