import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardc extends ahcz implements aheo
{
    public static final ardc a;
    private static volatile ahev m;
    public int b;
    public String c;
    public String d;
    public ahhk e;
    public ahhk f;
    public aras g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public ahdp l;
    
    static {
        ahcz.registerDefaultInstance(ardc.class, a = new ardc());
    }
    
    private ardc() {
        this.c = "";
        this.d = "";
        final ahbt b = ahbt.b;
        this.l = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = ardc.m) == null) {
                    synchronized (ardc.class) {
                        if (ardc.m == null) {
                            ardc.m = (ahev)new ahcs((ahcz)ardc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ardc.a;
            }
            case 4: {
                return new ahcr((short[][][])null, (short[][][])null);
            }
            case 3: {
                return new ardc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardc.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0000\u0001\u1008\u0000\u0005\u1008\u0002\u0006\u1009\u0003\u0007\u1009\u0004\b\u1009\u0007\t\u100c\b\n\u100c\t\u000b\u1001\n\u000f\u1007\u000e\u0011\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", arao.a(), "i", arbl.a(), "j", "k", "l", ardb.class });
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
