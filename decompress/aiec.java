import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiec extends ahcz implements aheo
{
    public static final aiec a;
    private static volatile ahev k;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public aiee g;
    public aief h;
    public String i;
    public int j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aiec.class, a = new aiec());
    }
    
    private aiec() {
        this.l = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aiec.k) == null) {
                    synchronized (aiec.class) {
                        if (aiec.k == null) {
                            aiec.k = (ahev)new ahcs((ahcz)aiec.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aiec.a;
            }
            case 4: {
                return new ahcr((ahcz)aiec.a);
            }
            case 3: {
                return new aiec();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiec.a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0001\u0002\u1008\u0000\u0003\u1008\u0002\u0005\u1008\u0003\u0006\u1409\u0005\u0007\u1007\u0004\b\u1009\u0006\f\u1008\n\u000e\u100c\u000b", new Object[] { "b", "c", "d", "e", "g", "f", "h", "i", "j", aidb.m });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
