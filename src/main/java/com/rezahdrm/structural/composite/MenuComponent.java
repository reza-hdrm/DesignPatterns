package com.rezahdrm.structural.composite;

import java.util.Objects;

// Component
public abstract class MenuComponent {
    private final String name;
    private final String url;

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuComponent that = (MenuComponent) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    protected String getLink() {
        return String.format("%s -> %s \n", name, url);
    }

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
