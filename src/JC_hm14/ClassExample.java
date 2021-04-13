package JC_hm14;

public class ClassExample implements Comparable<ClassExample> {

    private String country;
    private int citizens;

    public ClassExample(String country, int citizens) {
        this.country = country;
        this.citizens = citizens;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return "ClassExample \n{" +
                "country='" + country + '\'' +
                ", citizens=" + citizens +
                '}';
    }

    @Override
    public int compareTo(ClassExample o1) {
        int res = this.country.compareTo(o1.country);
        if (res == 0){
            res = Integer.compare(this.citizens, o1.citizens);
        }
        return res;
    }
}
