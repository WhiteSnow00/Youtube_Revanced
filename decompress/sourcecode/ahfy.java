import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfy extends agzi implements ahax
{
    public static final ahfy a;
    private static volatile ahbe e;
    public agzy b;
    public agzy c;
    public agzy d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahfy.class, a = new ahfy());
    }
    
    private ahfy() {
        this.f = 2;
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                final ahbe e;
                if ((e = ahfy.e) == null) {
                    synchronized (ahfy.class) {
                        if (ahfy.e == null) {
                            ahfy.e = (ahbe)new agzb((agzi)ahfy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahfy.a;
            }
            case 4: {
                return new agza((agzi)ahfy.a);
            }
            case 3: {
                return new ahfy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfy.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u041b\u0002\u001b\u0003\u001b", new Object[] { "b", ahga.class, "c", ahfx.class, "d", ahfz.class });
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
