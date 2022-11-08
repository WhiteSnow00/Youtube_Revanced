import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxz extends agzi implements ahax
{
    public static final aqxz a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(aqxz.class, a = new aqxz());
    }
    
    private aqxz() {
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
                if ((e = aqxz.e) == null) {
                    synchronized (aqxz.class) {
                        if (aqxz.e == null) {
                            aqxz.e = (ahbe)new agzb((agzi)aqxz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqxz.a;
            }
            case 4: {
                return new agza((boolean[][])null, (byte[][])null);
            }
            case 3: {
                return new aqxz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
