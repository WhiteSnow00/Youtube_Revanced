import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afnt extends agzi implements ahax
{
    public static final afnt a;
    private static volatile ahbe i;
    public int b;
    public afpd c;
    public agzy d;
    public afpd e;
    public afog f;
    public afob g;
    public afnu h;
    private afpd j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(afnt.class, a = new afnt());
    }
    
    private afnt() {
        this.k = 2;
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
                final ahbe i;
                if ((i = afnt.i) == null) {
                    synchronized (afnt.class) {
                        if (afnt.i == null) {
                            afnt.i = (ahbe)new agzb((agzi)afnt.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return afnt.a;
            }
            case 4: {
                return new agza((agzi)afnt.a);
            }
            case 3: {
                return new afnt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afnt.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0004\u0007\u1409\u0006\b\u1409\u0003\t\u1409\u0007", new Object[] { "b", "c", "d", afoh.class, "e", "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
