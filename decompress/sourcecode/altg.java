import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altg extends agzi implements ahax
{
    public static final altg a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final altg a2 = new altg();
        agzi.registerDefaultInstance(altg.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 260591906, ahcm.k, altg.class);
    }
    
    private altg() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = altg.g) == null) {
                    synchronized (altg.class) {
                        if (altg.g == null) {
                            altg.g = (ahbe)new agzb((agzi)altg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return altg.a;
            }
            case 4: {
                return new agza((agzi)altg.a);
            }
            case 3: {
                return new altg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)altg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
