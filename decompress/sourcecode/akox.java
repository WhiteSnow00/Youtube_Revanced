import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akox extends agzi implements ahax
{
    public static final akox a;
    private static volatile ahbe i;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public aock f;
    public int g;
    public agzy h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(akox.class, a = new akox());
    }
    
    private akox() {
        this.j = 2;
        this.d = "";
        this.e = "";
        this.h = agzi.emptyProtobufList();
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
                if ((i = akox.i) == null) {
                    synchronized (akox.class) {
                        if (akox.i == null) {
                            akox.i = (ahbe)new agzb((agzi)akox.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akox.a;
            }
            case 4: {
                return new agza((boolean[])null, (char[][])null);
            }
            case 3: {
                return new akox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akox.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0005\u100c\u0004\u0006\u001b", new Object[] { "b", "c", "d", "e", "f", "g", aocr.e, "h", akow.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
