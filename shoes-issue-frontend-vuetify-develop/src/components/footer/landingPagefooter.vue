<template>
  <div>
    <footer style="bottom: 0; width: 100%; position: fixed">
      <nav
        class="navbar navbar-expand-lg bg-body-tertiary"
        style="background-color: rgb(237, 241, 214); height: 35px"
      >
        <br />
        <span style="display: flex; justify-content: flex-end">
          <p>@ copyright(c) 2023 All rights reserved</p>
        </span>
      </nav>
    </footer>
  </div>
</template>


<script>
export default {
  computed: {
    userId() {
      return sessionStorage.getItem("userId");
    },
    userName() {
      return sessionStorage.getItem("userName");
    },
  },
};
</script>