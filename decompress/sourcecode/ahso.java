import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahso extends agzi implements ahax
{
    public static final ahso a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public long d;
    public agzy e;
    
    static {
        agzi.registerDefaultInstance(ahso.class, a = new ahso());
    }
    
    private ahso() {
        this.c = "";
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahso.f) == null) {
                    synchronized (ahso.class) {
                        if (ahso.f == null) {
                            ahso.f = (ahbe)new agzb((agzi)ahso.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahso.a;
            }
            case 4: {
                return new agza((char[])null, (short[][][])null);
            }
            case 3: {
                return new ahso();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahso.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", ahsn.class });
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