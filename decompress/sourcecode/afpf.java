import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpf extends agzi implements ahax
{
    public static final afpf a;
    private static volatile ahbe b;
    private int c;
    private afpe d;
    private String e;
    private int f;
    private afpk g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(afpf.class, a = new afpf());
    }
    
    private afpf() {
        this.h = 2;
        this.e = "";
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = afpf.b) == null) {
                    synchronized (afpf.class) {
                        if (afpf.b == null) {
                            afpf.b = (ahbe)new agzb((agzi)afpf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return afpf.a;
            }
            case 4: {
                return new agza((agzi)afpf.a);
            }
            case 3: {
                return new afpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpf.a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001\u1509\u0000\u0002\u1508\u0001\u0003\u1504\u0002\b\u1409\n", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
