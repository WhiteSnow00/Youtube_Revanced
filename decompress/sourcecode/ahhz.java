import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhz extends agzi implements ahax
{
    public static final ahhz a;
    private static volatile ahbe g;
    public int b;
    public agzy c;
    public agzy d;
    public anss e;
    public ajkm f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahhz.class, a = new ahhz());
    }
    
    private ahhz() {
        this.h = 2;
        this.c = agzi.emptyProtobufList();
        emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe g;
                if ((g = ahhz.g) == null) {
                    synchronized (ahhz.class) {
                        if (ahhz.g == null) {
                            ahhz.g = (ahbe)new agzb((agzi)ahhz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahhz.a;
            }
            case 4: {
                return new agza((agzi)ahhz.a);
            }
            case 3: {
                return new ahhz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhz.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0003\u0001\u041b\u0004\u041b\u0005\u1409\u0000\u0006\u1009\u0002", new Object[] { "b", "c", ahhy.class, "d", ahhx.class, "e", "f" });
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