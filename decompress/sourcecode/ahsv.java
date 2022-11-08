import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsv extends agzi implements ahax
{
    public static final ahsv a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public aioe f;
    public aioe g;
    public aioe h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahsv.class, a = new ahsv());
    }
    
    private ahsv() {
        this.j = 2;
        this.c = "";
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
                if ((i = ahsv.i) == null) {
                    synchronized (ahsv.class) {
                        if (ahsv.i == null) {
                            ahsv.i = (ahbe)new agzb((agzi)ahsv.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahsv.a;
            }
            case 4: {
                return new agza((agzi)ahsv.a);
            }
            case 3: {
                return new ahsv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1007\u0002", new Object[] { "b", "c", "d", "f", "g", "h", "e" });
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
