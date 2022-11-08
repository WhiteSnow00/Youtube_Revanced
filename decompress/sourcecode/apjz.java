import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjz extends agzi implements ahax
{
    public static final apjz a;
    private static volatile ahbe i;
    public int b;
    public agzy c;
    public agyc d;
    public agzy e;
    public agzy f;
    public apjy g;
    public agzy h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apjz.class, a = new apjz());
    }
    
    private apjz() {
        this.j = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agyc.b;
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((i = apjz.i) == null) {
                    synchronized (apjz.class) {
                        if (apjz.i == null) {
                            apjz.i = (ahbe)new agzb((agzi)apjz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apjz.a;
            }
            case 4: {
                return new agza((agzi)apjz.a);
            }
            case 3: {
                return new apjz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjz.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001\u041b\u0002\u100a\u0000\u0003\u001a\u0004\u001a\u0006\u1009\u0001\b\u001b", new Object[] { "b", "c", apjx.class, "d", "e", "f", "g", "h", apjw.class });
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
