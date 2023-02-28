package domain;

import java.util.List;

public class GetSystemItem {
    private List<DataBean> data;
    private Integer errorCode;
    private String errorMsg;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        private List<?> articleList;
        private String author;
        private List<ChildrenBean> children;
        private Integer courseId;
        private String cover;
        private String desc;
        private Integer id;
        private String lisense;
        private String lisenseLink;
        private String name;
        private Integer order;
        private Integer parentChapterId;
        private Integer type;
        private Boolean userControlSetTop;
        private Integer visible;

        public List<?> getArticleList() {
            return articleList;
        }

        public void setArticleList(List<?> articleList) {
            this.articleList = articleList;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public Integer getCourseId() {
            return courseId;
        }

        public void setCourseId(Integer courseId) {
            this.courseId = courseId;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLisense() {
            return lisense;
        }

        public void setLisense(String lisense) {
            this.lisense = lisense;
        }

        public String getLisenseLink() {
            return lisenseLink;
        }

        public void setLisenseLink(String lisenseLink) {
            this.lisenseLink = lisenseLink;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public Integer getParentChapterId() {
            return parentChapterId;
        }

        public void setParentChapterId(Integer parentChapterId) {
            this.parentChapterId = parentChapterId;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Boolean getUserControlSetTop() {
            return userControlSetTop;
        }

        public void setUserControlSetTop(Boolean userControlSetTop) {
            this.userControlSetTop = userControlSetTop;
        }

        public Integer getVisible() {
            return visible;
        }

        public void setVisible(Integer visible) {
            this.visible = visible;
        }

        public static class ChildrenBean {
            private List<?> articleList;
            private String author;
            private List<?> children;
            private Integer courseId;
            private String cover;
            private String desc;
            private Integer id;
            private String lisense;
            private String lisenseLink;
            private String name;
            private Integer order;
            private Integer parentChapterId;
            private Integer type;
            private Boolean userControlSetTop;
            private Integer visible;

            public List<?> getArticleList() {
                return articleList;
            }

            public void setArticleList(List<?> articleList) {
                this.articleList = articleList;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }

            public Integer getCourseId() {
                return courseId;
            }

            public void setCourseId(Integer courseId) {
                this.courseId = courseId;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getLisense() {
                return lisense;
            }

            public void setLisense(String lisense) {
                this.lisense = lisense;
            }

            public String getLisenseLink() {
                return lisenseLink;
            }

            public void setLisenseLink(String lisenseLink) {
                this.lisenseLink = lisenseLink;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getOrder() {
                return order;
            }

            public void setOrder(Integer order) {
                this.order = order;
            }

            public Integer getParentChapterId() {
                return parentChapterId;
            }

            public void setParentChapterId(Integer parentChapterId) {
                this.parentChapterId = parentChapterId;
            }

            public Integer getType() {
                return type;
            }

            public void setType(Integer type) {
                this.type = type;
            }

            public Boolean getUserControlSetTop() {
                return userControlSetTop;
            }

            public void setUserControlSetTop(Boolean userControlSetTop) {
                this.userControlSetTop = userControlSetTop;
            }

            public Integer getVisible() {
                return visible;
            }

            public void setVisible(Integer visible) {
                this.visible = visible;
            }
        }
    }
}
