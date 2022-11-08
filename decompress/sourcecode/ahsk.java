import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsk extends agzi implements ahax
{
    public static final ahsk a;
    private static volatile ahbe e;
    public int b;
    public ahsi c;
    public agzy d;
    private ahsj f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahsk.class, a = new ahsk());
    }
    
    private ahsk() {
        this.g = 2;
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
                if ((e = ahsk.e) == null) {
                    synchronized (ahsk.class) {
                        if (ahsk.e == null) {
                            ahsk.e = (ahbe)new agzb((agzi)ahsk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahsk.a;
            }
            case 4: {
                return new agza((agzi)ahsk.a);
            }
            case 3: {
                return new ahsk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b", new Object[] { "b", "f", "c", "d", ahsh.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
